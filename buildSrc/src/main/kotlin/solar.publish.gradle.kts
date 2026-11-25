// Maven Central publishing shared by every artifact. Set `description` in the module's build file.
plugins {
    id("com.vanniktech.maven.publish")
}

mavenPublishing {
    publishToMavenCentral()
    signAllPublications()
    coordinates(artifactId = "solar-icons-${project.name}")
    pom {
        name.set("Solar Icons " + project.name.split("-").joinToString(" ") { if (it == "bom") "BOM" else it.replaceFirstChar(Char::uppercase) })
        description.set(provider { project.description })
        url.set("https://github.com/wolfeleo2/solar-icons-compose")
        inceptionYear.set("2026")
        licenses {
            license {
                name.set("MIT")
                url.set("https://opensource.org/licenses/MIT")
            }
            license {
                name.set("CC BY 4.0 (Solar icon artwork by 480 Design)")
                url.set("https://creativecommons.org/licenses/by/4.0/")
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
