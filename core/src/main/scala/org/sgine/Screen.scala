package org.sgine

import com.badlogic.gdx.scenes.scene2d.{Group, Stage}
import com.badlogic.gdx.utils.viewport.ScreenViewport
import com.badlogic.gdx.{Gdx, Screen => GDXScreen}
import org.sgine.component._
import org.sgine.event.InputProcessor
import pl.metastack.metarx.Sub

class Screen extends RenderFlow with AbstractContainer with ActorWidget[Group] with InputSupport {
  lazy val stage = new Stage(new ScreenViewport)
  private[sgine] lazy val gdx = new GDXScreenInstance(this)

  lazy val actor: Group = stage.getRoot
  private val inputProcessor = new InputProcessor(this)

  val atCursor: Sub[Component] = Sub[Component](screen)
  val focused: Sub[Option[Focusable]] = Sub[Option[Focusable]](None)

  implicit def thisScreen: Screen = this

  create.once {
    var oldValue: Option[Focusable] = None
    focused.attach { newValue =>
      oldValue.foreach(_.blur.exec())
      newValue.foreach(_.focus.exec())
      oldValue = newValue
    }
  }

  resize.on {
    stage.getViewport.update(Gdx.graphics.getWidth, Gdx.graphics.getHeight, true)
    stage.getRoot.setWidth(Gdx.graphics.getWidth)
    stage.getRoot.setHeight(Gdx.graphics.getHeight)
  }

  show.on {
    Gdx.input.setInputProcessor(inputProcessor)
  }
  hide.on {
    if (Gdx.input.getInputProcessor == inputProcessor) {
      Gdx.input.setInputProcessor(null)
    }
  }

  render.on {
    stage.act(Gdx.graphics.getDeltaTime)
    stage.draw()
  }

  dispose.on {
    stage.dispose()
  }

  override def screen: Screen = this

  def +=(child: Component) = add(child)
  def -=(child: Component) = remove(child)

  override protected def add[C <: Component](child: C): C = {
    super.add(child)
    render.once {
      child match {
        case ac: ActorComponent[_] => screen.stage.getRoot.addActor(ac.actor)
        case _ => // Ignore non-actor components
      }
    }
    child
  }

  override protected def remove[C <: Component](child: C): C = {
    super.remove(child)
    render.once {
      child match {
        case ac: ActorComponent[_] => screen.stage.getRoot.removeActor(ac.actor)
        case _ => // Ignore non-actor components
      }
    }
    child
  }
}

class GDXScreenInstance(screen: Screen) extends GDXScreen {
  override def show(): Unit = {
    if (screen.create.nonEmpty) {
      screen.create.exec()
      screen.create.clear()
    }
    screen.show.exec()
  }

  override def hide(): Unit = screen.hide.exec()

  override def render(delta: Float): Unit = screen.render.exec()

  override def resize(width: Int, height: Int): Unit = screen.resize.exec()

  override def pause(): Unit = screen.pause.exec()

  override def resume(): Unit = screen.resume.exec()

  override def dispose(): Unit = screen.dispose.exec()
}