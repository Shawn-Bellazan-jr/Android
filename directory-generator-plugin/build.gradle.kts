plugins {
    `kotlin-dsl`
    `maven-publish`
    signing
}

group = "com.tooensure.io" // Replace with your group ID
version = "1.0.0" // Replace with your version

dependencies {
    implementation(kotlin("stdlib"))
}
publishing {
    publications {
        create<MavenPublication>("directoryGeneratorMaven") {
            from(components["kotlin"])

            pom {
                name.set("Directory Generator Plugin")
                description.set("A description of my plugin.")
                url.set("https://github.com/Shawn-Bellazan-jr/Android/tree/master/app/src/main/java/com/example/android/ui")

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
                    developerConnection.set("scm:git:ssh://github.com/Shawn-Bellazan-jr/your-repo.git")
                    url.set("https://github.com/Shawn-Bellazan-jr/your-repo")
                }
            }
        }
    }
}
signing {
    sign(publishing.publications["directoryGeneratorMaven"])
}
