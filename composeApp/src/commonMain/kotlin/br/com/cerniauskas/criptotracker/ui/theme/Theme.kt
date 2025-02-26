package com.plcoding.cryptotracker.ui.theme


import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import br.com.cerniauskas.criptotracker.ui.theme.backgroundDark
import br.com.cerniauskas.criptotracker.ui.theme.backgroundDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.backgroundDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.backgroundLight
import br.com.cerniauskas.criptotracker.ui.theme.backgroundLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.backgroundLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.errorContainerDark
import br.com.cerniauskas.criptotracker.ui.theme.errorContainerDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.errorContainerDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.errorContainerLight
import br.com.cerniauskas.criptotracker.ui.theme.errorContainerLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.errorContainerLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.errorDark
import br.com.cerniauskas.criptotracker.ui.theme.errorDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.errorDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.errorLight
import br.com.cerniauskas.criptotracker.ui.theme.errorLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.errorLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.inverseOnSurfaceDark
import br.com.cerniauskas.criptotracker.ui.theme.inverseOnSurfaceDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.inverseOnSurfaceDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.inverseOnSurfaceLight
import br.com.cerniauskas.criptotracker.ui.theme.inverseOnSurfaceLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.inverseOnSurfaceLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.inversePrimaryDark
import br.com.cerniauskas.criptotracker.ui.theme.inversePrimaryDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.inversePrimaryDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.inversePrimaryLight
import br.com.cerniauskas.criptotracker.ui.theme.inversePrimaryLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.inversePrimaryLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.inverseSurfaceDark
import br.com.cerniauskas.criptotracker.ui.theme.inverseSurfaceDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.inverseSurfaceDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.inverseSurfaceLight
import br.com.cerniauskas.criptotracker.ui.theme.inverseSurfaceLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.inverseSurfaceLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.onBackgroundDark
import br.com.cerniauskas.criptotracker.ui.theme.onBackgroundDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.onBackgroundDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.onBackgroundLight
import br.com.cerniauskas.criptotracker.ui.theme.onBackgroundLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.onBackgroundLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.onErrorContainerDark
import br.com.cerniauskas.criptotracker.ui.theme.onErrorContainerDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.onErrorContainerDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.onErrorContainerLight
import br.com.cerniauskas.criptotracker.ui.theme.onErrorContainerLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.onErrorContainerLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.onErrorDark
import br.com.cerniauskas.criptotracker.ui.theme.onErrorDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.onErrorDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.onErrorLight
import br.com.cerniauskas.criptotracker.ui.theme.onErrorLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.onErrorLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.onPrimaryContainerDark
import br.com.cerniauskas.criptotracker.ui.theme.onPrimaryContainerDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.onPrimaryContainerDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.onPrimaryContainerLight
import br.com.cerniauskas.criptotracker.ui.theme.onPrimaryContainerLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.onPrimaryContainerLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.onPrimaryDark
import br.com.cerniauskas.criptotracker.ui.theme.onPrimaryDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.onPrimaryDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.onPrimaryLight
import br.com.cerniauskas.criptotracker.ui.theme.onPrimaryLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.onPrimaryLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.onSecondaryContainerDark
import br.com.cerniauskas.criptotracker.ui.theme.onSecondaryContainerDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.onSecondaryContainerDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.onSecondaryContainerLight
import br.com.cerniauskas.criptotracker.ui.theme.onSecondaryContainerLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.onSecondaryContainerLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.onSecondaryDark
import br.com.cerniauskas.criptotracker.ui.theme.onSecondaryDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.onSecondaryDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.onSecondaryLight
import br.com.cerniauskas.criptotracker.ui.theme.onSecondaryLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.onSecondaryLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.onSurfaceDark
import br.com.cerniauskas.criptotracker.ui.theme.onSurfaceDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.onSurfaceDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.onSurfaceLight
import br.com.cerniauskas.criptotracker.ui.theme.onSurfaceLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.onSurfaceLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.onSurfaceVariantDark
import br.com.cerniauskas.criptotracker.ui.theme.onSurfaceVariantDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.onSurfaceVariantDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.onSurfaceVariantLight
import br.com.cerniauskas.criptotracker.ui.theme.onSurfaceVariantLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.onSurfaceVariantLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.onTertiaryContainerDark
import br.com.cerniauskas.criptotracker.ui.theme.onTertiaryContainerDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.onTertiaryContainerDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.onTertiaryContainerLight
import br.com.cerniauskas.criptotracker.ui.theme.onTertiaryContainerLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.onTertiaryContainerLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.onTertiaryDark
import br.com.cerniauskas.criptotracker.ui.theme.onTertiaryDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.onTertiaryDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.onTertiaryLight
import br.com.cerniauskas.criptotracker.ui.theme.onTertiaryLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.onTertiaryLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.outlineDark
import br.com.cerniauskas.criptotracker.ui.theme.outlineDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.outlineDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.outlineLight
import br.com.cerniauskas.criptotracker.ui.theme.outlineLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.outlineLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.outlineVariantDark
import br.com.cerniauskas.criptotracker.ui.theme.outlineVariantDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.outlineVariantDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.outlineVariantLight
import br.com.cerniauskas.criptotracker.ui.theme.outlineVariantLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.outlineVariantLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.primaryContainerDark
import br.com.cerniauskas.criptotracker.ui.theme.primaryContainerDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.primaryContainerDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.primaryContainerLight
import br.com.cerniauskas.criptotracker.ui.theme.primaryContainerLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.primaryContainerLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.primaryDark
import br.com.cerniauskas.criptotracker.ui.theme.primaryDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.primaryDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.primaryLight
import br.com.cerniauskas.criptotracker.ui.theme.primaryLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.primaryLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.scrimDark
import br.com.cerniauskas.criptotracker.ui.theme.scrimDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.scrimDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.scrimLight
import br.com.cerniauskas.criptotracker.ui.theme.scrimLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.scrimLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.secondaryContainerDark
import br.com.cerniauskas.criptotracker.ui.theme.secondaryContainerDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.secondaryContainerDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.secondaryContainerLight
import br.com.cerniauskas.criptotracker.ui.theme.secondaryContainerLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.secondaryContainerLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.secondaryDark
import br.com.cerniauskas.criptotracker.ui.theme.secondaryDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.secondaryDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.secondaryLight
import br.com.cerniauskas.criptotracker.ui.theme.secondaryLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.secondaryLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceBrightDark
import br.com.cerniauskas.criptotracker.ui.theme.surfaceBrightDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceBrightDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceBrightLight
import br.com.cerniauskas.criptotracker.ui.theme.surfaceBrightLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceBrightLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceContainerDark
import br.com.cerniauskas.criptotracker.ui.theme.surfaceContainerDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceContainerDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceContainerHighDark
import br.com.cerniauskas.criptotracker.ui.theme.surfaceContainerHighDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceContainerHighDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceContainerHighLight
import br.com.cerniauskas.criptotracker.ui.theme.surfaceContainerHighLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceContainerHighLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceContainerHighestDark
import br.com.cerniauskas.criptotracker.ui.theme.surfaceContainerHighestDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceContainerHighestDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceContainerHighestLight
import br.com.cerniauskas.criptotracker.ui.theme.surfaceContainerHighestLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceContainerHighestLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceContainerLight
import br.com.cerniauskas.criptotracker.ui.theme.surfaceContainerLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceContainerLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceContainerLowDark
import br.com.cerniauskas.criptotracker.ui.theme.surfaceContainerLowDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceContainerLowDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceContainerLowLight
import br.com.cerniauskas.criptotracker.ui.theme.surfaceContainerLowLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceContainerLowLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceContainerLowestDark
import br.com.cerniauskas.criptotracker.ui.theme.surfaceContainerLowestDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceContainerLowestDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceContainerLowestLight
import br.com.cerniauskas.criptotracker.ui.theme.surfaceContainerLowestLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceContainerLowestLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceDark
import br.com.cerniauskas.criptotracker.ui.theme.surfaceDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceDimDark
import br.com.cerniauskas.criptotracker.ui.theme.surfaceDimDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceDimDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceDimLight
import br.com.cerniauskas.criptotracker.ui.theme.surfaceDimLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceDimLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceLight
import br.com.cerniauskas.criptotracker.ui.theme.surfaceLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceVariantDark
import br.com.cerniauskas.criptotracker.ui.theme.surfaceVariantDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceVariantDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceVariantLight
import br.com.cerniauskas.criptotracker.ui.theme.surfaceVariantLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.surfaceVariantLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.tertiaryContainerDark
import br.com.cerniauskas.criptotracker.ui.theme.tertiaryContainerDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.tertiaryContainerDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.tertiaryContainerLight
import br.com.cerniauskas.criptotracker.ui.theme.tertiaryContainerLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.tertiaryContainerLightMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.tertiaryDark
import br.com.cerniauskas.criptotracker.ui.theme.tertiaryDarkHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.tertiaryDarkMediumContrast
import br.com.cerniauskas.criptotracker.ui.theme.tertiaryLight
import br.com.cerniauskas.criptotracker.ui.theme.tertiaryLightHighContrast
import br.com.cerniauskas.criptotracker.ui.theme.tertiaryLightMediumContrast

private val lightScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
    surfaceDim = surfaceDimLight,
    surfaceBright = surfaceBrightLight,
    surfaceContainerLowest = surfaceContainerLowestLight,
    surfaceContainerLow = surfaceContainerLowLight,
    surfaceContainer = surfaceContainerLight,
    surfaceContainerHigh = surfaceContainerHighLight,
    surfaceContainerHighest = surfaceContainerHighestLight,
)

private val darkScheme = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,
    surfaceDim = surfaceDimDark,
    surfaceBright = surfaceBrightDark,
    surfaceContainerLowest = surfaceContainerLowestDark,
    surfaceContainerLow = surfaceContainerLowDark,
    surfaceContainer = surfaceContainerDark,
    surfaceContainerHigh = surfaceContainerHighDark,
    surfaceContainerHighest = surfaceContainerHighestDark,
)

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = primaryLightMediumContrast,
    onPrimary = onPrimaryLightMediumContrast,
    primaryContainer = primaryContainerLightMediumContrast,
    onPrimaryContainer = onPrimaryContainerLightMediumContrast,
    secondary = secondaryLightMediumContrast,
    onSecondary = onSecondaryLightMediumContrast,
    secondaryContainer = secondaryContainerLightMediumContrast,
    onSecondaryContainer = onSecondaryContainerLightMediumContrast,
    tertiary = tertiaryLightMediumContrast,
    onTertiary = onTertiaryLightMediumContrast,
    tertiaryContainer = tertiaryContainerLightMediumContrast,
    onTertiaryContainer = onTertiaryContainerLightMediumContrast,
    error = errorLightMediumContrast,
    onError = onErrorLightMediumContrast,
    errorContainer = errorContainerLightMediumContrast,
    onErrorContainer = onErrorContainerLightMediumContrast,
    background = backgroundLightMediumContrast,
    onBackground = onBackgroundLightMediumContrast,
    surface = surfaceLightMediumContrast,
    onSurface = onSurfaceLightMediumContrast,
    surfaceVariant = surfaceVariantLightMediumContrast,
    onSurfaceVariant = onSurfaceVariantLightMediumContrast,
    outline = outlineLightMediumContrast,
    outlineVariant = outlineVariantLightMediumContrast,
    scrim = scrimLightMediumContrast,
    inverseSurface = inverseSurfaceLightMediumContrast,
    inverseOnSurface = inverseOnSurfaceLightMediumContrast,
    inversePrimary = inversePrimaryLightMediumContrast,
    surfaceDim = surfaceDimLightMediumContrast,
    surfaceBright = surfaceBrightLightMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestLightMediumContrast,
    surfaceContainerLow = surfaceContainerLowLightMediumContrast,
    surfaceContainer = surfaceContainerLightMediumContrast,
    surfaceContainerHigh = surfaceContainerHighLightMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestLightMediumContrast,
)

private val highContrastLightColorScheme = lightColorScheme(
    primary = primaryLightHighContrast,
    onPrimary = onPrimaryLightHighContrast,
    primaryContainer = primaryContainerLightHighContrast,
    onPrimaryContainer = onPrimaryContainerLightHighContrast,
    secondary = secondaryLightHighContrast,
    onSecondary = onSecondaryLightHighContrast,
    secondaryContainer = secondaryContainerLightHighContrast,
    onSecondaryContainer = onSecondaryContainerLightHighContrast,
    tertiary = tertiaryLightHighContrast,
    onTertiary = onTertiaryLightHighContrast,
    tertiaryContainer = tertiaryContainerLightHighContrast,
    onTertiaryContainer = onTertiaryContainerLightHighContrast,
    error = errorLightHighContrast,
    onError = onErrorLightHighContrast,
    errorContainer = errorContainerLightHighContrast,
    onErrorContainer = onErrorContainerLightHighContrast,
    background = backgroundLightHighContrast,
    onBackground = onBackgroundLightHighContrast,
    surface = surfaceLightHighContrast,
    onSurface = onSurfaceLightHighContrast,
    surfaceVariant = surfaceVariantLightHighContrast,
    onSurfaceVariant = onSurfaceVariantLightHighContrast,
    outline = outlineLightHighContrast,
    outlineVariant = outlineVariantLightHighContrast,
    scrim = scrimLightHighContrast,
    inverseSurface = inverseSurfaceLightHighContrast,
    inverseOnSurface = inverseOnSurfaceLightHighContrast,
    inversePrimary = inversePrimaryLightHighContrast,
    surfaceDim = surfaceDimLightHighContrast,
    surfaceBright = surfaceBrightLightHighContrast,
    surfaceContainerLowest = surfaceContainerLowestLightHighContrast,
    surfaceContainerLow = surfaceContainerLowLightHighContrast,
    surfaceContainer = surfaceContainerLightHighContrast,
    surfaceContainerHigh = surfaceContainerHighLightHighContrast,
    surfaceContainerHighest = surfaceContainerHighestLightHighContrast,
)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkMediumContrast,
    onPrimary = onPrimaryDarkMediumContrast,
    primaryContainer = primaryContainerDarkMediumContrast,
    onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
    secondary = secondaryDarkMediumContrast,
    onSecondary = onSecondaryDarkMediumContrast,
    secondaryContainer = secondaryContainerDarkMediumContrast,
    onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
    tertiary = tertiaryDarkMediumContrast,
    onTertiary = onTertiaryDarkMediumContrast,
    tertiaryContainer = tertiaryContainerDarkMediumContrast,
    onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
    error = errorDarkMediumContrast,
    onError = onErrorDarkMediumContrast,
    errorContainer = errorContainerDarkMediumContrast,
    onErrorContainer = onErrorContainerDarkMediumContrast,
    background = backgroundDarkMediumContrast,
    onBackground = onBackgroundDarkMediumContrast,
    surface = surfaceDarkMediumContrast,
    onSurface = onSurfaceDarkMediumContrast,
    surfaceVariant = surfaceVariantDarkMediumContrast,
    onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
    outline = outlineDarkMediumContrast,
    outlineVariant = outlineVariantDarkMediumContrast,
    scrim = scrimDarkMediumContrast,
    inverseSurface = inverseSurfaceDarkMediumContrast,
    inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
    inversePrimary = inversePrimaryDarkMediumContrast,
    surfaceDim = surfaceDimDarkMediumContrast,
    surfaceBright = surfaceBrightDarkMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkMediumContrast,
    surfaceContainerLow = surfaceContainerLowDarkMediumContrast,
    surfaceContainer = surfaceContainerDarkMediumContrast,
    surfaceContainerHigh = surfaceContainerHighDarkMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkMediumContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkHighContrast,
    onPrimary = onPrimaryDarkHighContrast,
    primaryContainer = primaryContainerDarkHighContrast,
    onPrimaryContainer = onPrimaryContainerDarkHighContrast,
    secondary = secondaryDarkHighContrast,
    onSecondary = onSecondaryDarkHighContrast,
    secondaryContainer = secondaryContainerDarkHighContrast,
    onSecondaryContainer = onSecondaryContainerDarkHighContrast,
    tertiary = tertiaryDarkHighContrast,
    onTertiary = onTertiaryDarkHighContrast,
    tertiaryContainer = tertiaryContainerDarkHighContrast,
    onTertiaryContainer = onTertiaryContainerDarkHighContrast,
    error = errorDarkHighContrast,
    onError = onErrorDarkHighContrast,
    errorContainer = errorContainerDarkHighContrast,
    onErrorContainer = onErrorContainerDarkHighContrast,
    background = backgroundDarkHighContrast,
    onBackground = onBackgroundDarkHighContrast,
    surface = surfaceDarkHighContrast,
    onSurface = onSurfaceDarkHighContrast,
    surfaceVariant = surfaceVariantDarkHighContrast,
    onSurfaceVariant = onSurfaceVariantDarkHighContrast,
    outline = outlineDarkHighContrast,
    outlineVariant = outlineVariantDarkHighContrast,
    scrim = scrimDarkHighContrast,
    inverseSurface = inverseSurfaceDarkHighContrast,
    inverseOnSurface = inverseOnSurfaceDarkHighContrast,
    inversePrimary = inversePrimaryDarkHighContrast,
    surfaceDim = surfaceDimDarkHighContrast,
    surfaceBright = surfaceBrightDarkHighContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkHighContrast,
    surfaceContainerLow = surfaceContainerLowDarkHighContrast,
    surfaceContainer = surfaceContainerDarkHighContrast,
    surfaceContainerHigh = surfaceContainerHighDarkHighContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkHighContrast,
)

@Composable
fun CryptoTrackerTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        highContrastDarkColorScheme
    } else {
        highContrastLightColorScheme
    }

    MaterialTheme(
        colorScheme = colors,
        typography = AppTypography(),
        content = content
    )
}