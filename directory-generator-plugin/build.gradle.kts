plugins {
    `kotlin-dsl`
    `maven-publish`
    `java-gradle-plugin`
    id("signing") // Correct plugin syntax for signing
}

group = "com.tooensure.io.directory-generator" // Replace with your group ID
version = "1.0.0" // Replace with your version

dependencies {
    implementation(kotlin("stdlib"))
}

gradlePlugin {
    plugins {
        create("directoryGeneratorPlugin") {
            id = "com.tooensure.io.directory-generator" // Plugin ID
            implementationClass = "com.tooensure.DirectoryGeneratorPlugin" // Fully qualified name of the plugin class
        }
    }
}

publishing {
    publications {
        create<MavenPublication>("directoryGeneratorMaven") {
            from(components["kotlin"]) // Use "java" instead of "kotlin" for Gradle plugin publication

            pom {
                name.set("Directory Generator Plugin")
                description.set("A Gradle plugin to generate directories.")
                url.set("https://github.com/Shawn-Bellazan-jr/Android")

                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }

                developers {
                    developer {
                        id.set("shawn_delaine_bellazan")
                        name.set("Shawn Bellazan")
                        email.set("shawn_bellazan@outlook.com")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/Shawn-Bellazan-jr/your-repo.git")
                    developerConnection.set("scm:git:ssh://github.com/Shawn-Bellazan-jr/Android.git")
                    url.set("https://github.com/Shawn-Bellazan-jr/your-repo")
                }
            }
        }
    }

    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://jitpack.io")
            credentials {
                username = System.getenv("GITHUB_USERNAME") ?: ""
                password = System.getenv("GITHUB_TOKEN") ?: "" // The token is used as the password
            }
        }
    }
}

signing {
    useGpgCmd() // This ensures the signing will use the GPG command-line tool
    sign(publishing.publications["directoryGeneratorMaven"])
}
