package org.sgine

case class Color(red: Double = 0.0, green: Double = 0.0, blue: Double = 0.0, alpha: Double = 0.0)

object Color {
  lazy val AliceBlue = fromLong(0xF0F8FF)
  lazy val AntiqueWhite = fromLong(0xFAEBD7)
  lazy val Aqua = fromLong(0x00FFFF)
  lazy val Aquamarine = fromLong(0x7FFFD4)
  lazy val Azure = fromLong(0xF0FFFF)
  lazy val Beige = fromLong(0xF5F5DC)
  lazy val Bisque = fromLong(0xFFE4C4)
  lazy val Black = fromLong(0x000000)
  lazy val BlanchedAlmond = fromLong(0xFFEBCD)
  lazy val Blue = fromLong(0x0000FF)
  lazy val BlueViolet = fromLong(0x8A2BE2)
  lazy val Brown = fromLong(0xA52A2A)
  lazy val BurlyWood = fromLong(0xDEB887)
  lazy val CadetBlue = fromLong(0x5F9EA0)
  lazy val Chartreuse = fromLong(0x7FFF00)
  lazy val Chocolate = fromLong(0xD2691E)
  lazy val Coral = fromLong(0xFF7F50)
  lazy val CornflowerBlue = fromLong(0x6495ED)
  lazy val Cornsilk = fromLong(0xFFF8DC)
  lazy val Crimson = fromLong(0xDC143C)
  lazy val Cyan = fromLong(0x00FFFF)
  lazy val DarkBlue = fromLong(0x00008B)
  lazy val DarkCyan = fromLong(0x008B8B)
  lazy val DarkGoldenRod = fromLong(0xB8860B)
  lazy val DarkGray = fromLong(0xA9A9A9)
  lazy val DarkGreen = fromLong(0x006400)
  lazy val DarkKhaki = fromLong(0xBDB76B)
  lazy val DarkMagenta = fromLong(0x8B008B)
  lazy val DarkOliveGreen = fromLong(0x556B2F)
  lazy val DarkOrange = fromLong(0xFF8C00)
  lazy val DarkOrchid = fromLong(0x9932CC)
  lazy val DarkRed = fromLong(0x8B0000)
  lazy val DarkSalmon = fromLong(0xE9967A)
  lazy val DarkSeaGreen = fromLong(0x8FBC8F)
  lazy val DarkSlateBlue = fromLong(0x483D8B)
  lazy val DarkSlateGray = fromLong(0x2F4F4F)
  lazy val DarkTurquoise = fromLong(0x00CED1)
  lazy val DarkViolet = fromLong(0x9400D3)
  lazy val DeepPink = fromLong(0xFF1493)
  lazy val DeepSkyBlue = fromLong(0x00BFFF)
  lazy val DimGray = fromLong(0x696969)
  lazy val DodgerBlue = fromLong(0x1E90FF)
  lazy val FireBrick = fromLong(0xB22222)
  lazy val FloralWhite = fromLong(0xFFFAF0)
  lazy val ForestGreen = fromLong(0x228B22)
  lazy val Fuchsia = fromLong(0xFF00FF)
  lazy val Gainsboro = fromLong(0xDCDCDC)
  lazy val GhostWhite = fromLong(0xF8F8FF)
  lazy val Gold = fromLong(0xFFD700)
  lazy val GoldenRod = fromLong(0xDAA520)
  lazy val Gray = fromLong(0x808080)
  lazy val Green = fromLong(0x008000)
  lazy val GreenYellow = fromLong(0xADFF2F)
  lazy val HoneyDew = fromLong(0xF0FFF0)
  lazy val HotPink = fromLong(0xFF69B4)
  lazy val IndianRed  = "#CD5C5C"
  lazy val Indigo   = "#4B0082"
  lazy val Ivory = fromLong(0xFFFFF0)
  lazy val Khaki = fromLong(0xF0E68C)
  lazy val Lavender = fromLong(0xE6E6FA)
  lazy val LavenderBlush = fromLong(0xFFF0F5)
  lazy val LawnGreen = fromLong(0x7CFC00)
  lazy val LemonChiffon = fromLong(0xFFFACD)
  lazy val LightBlue = fromLong(0xADD8E6)
  lazy val LightCoral = fromLong(0xF08080)
  lazy val LightCyan = fromLong(0xE0FFFF)
  lazy val LightGoldenRodYellow = fromLong(0xFAFAD2)
  lazy val LightGray = fromLong(0xD3D3D3)
  lazy val LightGreen = fromLong(0x90EE90)
  lazy val LightPink = fromLong(0xFFB6C1)
  lazy val LightSalmon = fromLong(0xFFA07A)
  lazy val LightSeaGreen = fromLong(0x20B2AA)
  lazy val LightSkyBlue = fromLong(0x87CEFA)
  lazy val LightSlateGray = fromLong(0x778899)
  lazy val LightSteelBlue = fromLong(0xB0C4DE)
  lazy val LightYellow = fromLong(0xFFFFE0)
  lazy val Lime = fromLong(0x00FF00)
  lazy val LimeGreen = fromLong(0x32CD32)
  lazy val Linen = fromLong(0xFAF0E6)
  lazy val Magenta = fromLong(0xFF00FF)
  lazy val Maroon = fromLong(0x800000)
  lazy val MediumAquaMarine = fromLong(0x66CDAA)
  lazy val MediumBlue = fromLong(0x0000CD)
  lazy val MediumOrchid = fromLong(0xBA55D3)
  lazy val MediumPurple = fromLong(0x9370DB)
  lazy val MediumSeaGreen = fromLong(0x3CB371)
  lazy val MediumSlateBlue = fromLong(0x7B68EE)
  lazy val MediumSpringGreen = fromLong(0x00FA9A)
  lazy val MediumTurquoise = fromLong(0x48D1CC)
  lazy val MediumVioletRed = fromLong(0xC71585)
  lazy val MidnightBlue = fromLong(0x191970)
  lazy val MintCream = fromLong(0xF5FFFA)
  lazy val MistyRose = fromLong(0xFFE4E1)
  lazy val Moccasin = fromLong(0xFFE4B5)
  lazy val NavajoWhite = fromLong(0xFFDEAD)
  lazy val Navy = fromLong(0x000080)
  lazy val OldLace = fromLong(0xFDF5E6)
  lazy val Olive = fromLong(0x808000)
  lazy val OliveDrab = fromLong(0x6B8E23)
  lazy val Orange = fromLong(0xFFA500)
  lazy val OrangeRed = fromLong(0xFF4500)
  lazy val Orchid = fromLong(0xDA70D6)
  lazy val PaleGoldenRod = fromLong(0xEEE8AA)
  lazy val PaleGreen = fromLong(0x98FB98)
  lazy val PaleTurquoise = fromLong(0xAFEEEE)
  lazy val PaleVioletRed = fromLong(0xDB7093)
  lazy val PapayaWhip = fromLong(0xFFEFD5)
  lazy val PeachPuff = fromLong(0xFFDAB9)
  lazy val Peru = fromLong(0xCD853F)
  lazy val Pink = fromLong(0xFFC0CB)
  lazy val Plum = fromLong(0xDDA0DD)
  lazy val PowderBlue = fromLong(0xB0E0E6)
  lazy val Purple = fromLong(0x800080)
  lazy val RebeccaPurple = fromLong(0x663399)
  lazy val Red = fromLong(0xFF0000)
  lazy val RosyBrown = fromLong(0xBC8F8F)
  lazy val RoyalBlue = fromLong(0x4169E1)
  lazy val SaddleBrown = fromLong(0x8B4513)
  lazy val Salmon = fromLong(0xFA8072)
  lazy val SandyBrown = fromLong(0xF4A460)
  lazy val SeaGreen = fromLong(0x2E8B57)
  lazy val SeaShell = fromLong(0xFFF5EE)
  lazy val Sienna = fromLong(0xA0522D)
  lazy val Silver = fromLong(0xC0C0C0)
  lazy val SkyBlue = fromLong(0x87CEEB)
  lazy val SlateBlue = fromLong(0x6A5ACD)
  lazy val SlateGray = fromLong(0x708090)
  lazy val Snow = fromLong(0xFFFAFA)
  lazy val SpringGreen = fromLong(0x00FF7F)
  lazy val SteelBlue = fromLong(0x4682B4)
  lazy val Tan = fromLong(0xD2B48C)
  lazy val Teal = fromLong(0x008080)
  lazy val Thistle = fromLong(0xD8BFD8)
  lazy val Tomato = fromLong(0xFF6347)
  lazy val Turquoise = fromLong(0x40E0D0)
  lazy val Violet = fromLong(0xEE82EE)
  lazy val Wheat = fromLong(0xF5DEB3)
  lazy val White = fromLong(0xFFFFFF)
  lazy val WhiteSmoke = fromLong(0xF5F5F5)
  lazy val Yellow = fromLong(0xFFFF00)
  lazy val YellowGreen = fromLong(0x9ACD32)

  def fromLong(value: Long): Color = Color(
    red = (value >> 16 & 0xff) / 255.0,
    green = (value >> 8 & 0xff) / 255.0,
    blue = (value >> 0 & 0xff) / 255.0,
    alpha = (value >> 24 & 0xff) / 255.0
  )
  
  def fromHex(hex: String): Color = fromLong(java.lang.Long.parseLong(hex, 16))
}