package themes

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

val LightColors = lightColorScheme(
    primary = Color.parseHex("#FA6650"),
    secondary = Color.parseHex("#D24C3A"),
    background = Color.parseHex("#FFFFFF"),
    surface = Color.parseHex("#F5F5F5"),
    error = Color.parseHex("#FF0000"),
    onPrimary = Color.parseHex("#000000"),
    onSecondary = Color.parseHex("#FFFFFF"),
    onBackground = Color.parseHex("#000000"),
    onSurface = Color.parseHex("#000000"),
    onError = Color.parseHex("#FFFFFF"),
)


val DarkColors = darkColorScheme(
    primary = Color.parseHex("#FA6650"),
    secondary = Color.parseHex("#A03226"),
    background = Color.parseHex("#121212"),
    surface = Color.parseHex("#212121"),
    error = Color.parseHex("#D32F2F"),
    onPrimary = Color.parseHex("#FFFFFF"),
    onSecondary = Color.parseHex("#000000"),
    onBackground = Color.parseHex("#FFFFFF"),
    onSurface = Color.parseHex("#FFFFFF"),
    onError = Color.parseHex("#000000"),
)

fun Color.Companion.parseHex(hex: String): Color {
    return Color(hex.removePrefix("#").toLong(16) or 0x00000000FF000000)
}
