plugins {
    id("solar.module")
}

description = "Core runtime and duotone theming for Solar Icons in Compose Multiplatform"

kotlin {
    sourceSets {
        commonMain.dependencies {
            api(libs.compose.runtime)
            api(libs.compose.ui)
            implementation(libs.compose.material3)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}
