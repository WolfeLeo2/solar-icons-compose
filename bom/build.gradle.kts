
plugins {
    `java-platform`
    alias(libs.plugins.vanniktech.publish)
}

javaPlatform {
    allowDependencies()
}

dependencies {
    constraints {
        api(project(":core"))
        api(project(":bold"))
        api(project(":bold-duotone"))
        api(project(":linear"))
        api(project(":line-duotone"))
        api(project(":broken"))
        api(project(":outline"))
        api(project(":all"))
    }
}

mavenPublishing {
    publishToMavenCentral()
    signAllPublications()
    coordinates(artifactId = "solar-icons-bom")
    pom {
        name.set("Solar Icons BOM")
        description.set("Bill of Materials (BOM) to align all Solar Icons Compose dependencies")
        url.set("https://github.com/wolfeleo2/solar-icons-compose")
        inceptionYear.set("2026")
        licenses {
            license {
                name.set("MIT")
                url.set("https://opensource.org/licenses/MIT")
            }
        }
        developers {
            developer {
                id.set("wolfeleo2")
                name.set("Leo Wolfe")
            }
        }
        scm {
            url.set("https://github.com/wolfeleo2/solar-icons-compose")
            connection.set("scm:git:git://github.com/wolfeleo2/solar-icons-compose.git")
            developerConnection.set("scm:git:ssh://git@github.com/wolfeleo2/solar-icons-compose.git")
        }
    }
}
