package com.nevidimka655.compose_color_schemes

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme

val MaterialTheme.colorSchemes get() = _ColorSchemes.colors

object _ColorSchemes {
    object colors

    var isDarkTheme = false

    internal fun autoScheme(lightScheme: ColorScheme, darkScheme: ColorScheme) =
        if (isDarkTheme) darkScheme else lightScheme

}