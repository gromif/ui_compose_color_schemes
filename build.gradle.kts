plugins {
    alias(libs.plugins.astracrypt.android.library)
    alias(libs.plugins.compose.compiler)
}

android {
    namespace = "com.nevidimka655.compose_color_schemes"

    defaultConfig {
        consumerProguardFiles("consumer-rules.pro")

        buildFeatures.compose = true
    }
}

dependencies {
    api(platform(libs.compose.bom))
    api(libs.compose.ui.tooling)
    debugApi(libs.compose.ui.test.manifest)
    api(libs.compose.material3)
}