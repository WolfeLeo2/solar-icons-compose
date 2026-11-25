plugins {
    id("solar.module")
}

description = "Umbrella artifact including all 6 styles of Solar Icons for Compose Multiplatform"

kotlin {
    sourceSets.commonMain.dependencies {
        api(project(":core"))
        api(project(":bold"))
        api(project(":bold-duotone"))
        api(project(":linear"))
        api(project(":line-duotone"))
        api(project(":broken"))
        api(project(":outline"))
    }
}
