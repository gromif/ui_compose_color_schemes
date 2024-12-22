plugins {
    alias(libs.plugins.astracrypt.android.library)
    alias(libs.plugins.astracrypt.android.library.compose)
}

android {
    namespace = "com.nevidimka655.compose_color_schemes"

    defaultConfig {
        consumerProguardFiles("consumer-rules.pro")
    }
}