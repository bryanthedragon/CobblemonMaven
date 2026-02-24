plugins {
    id("java")
    id("java-library")
    id("maven-publish")
    id("dev.architectury.loom")
}

java {
    withSourcesJar()
    withJavadocJar()
}

publishing {
    repositories {
        maven("https://maven.impactdev.net/repository/development/") {
            name = "ImpactDev-Public"
            credentials {
                username = System.getenv("COBBLEMON_MAVEN_USER")
                password = System.getenv("COBBLEMON_MAVEN_PASSWORD")
            }
        }
        mavenLocal()
    }

    publications {
        create<MavenPublication>("mavenJava") {
            artifact(tasks.named("remapJar"))
            artifact(tasks.named("remapSourcesJar"))

            groupId = "com.cobblemon"
            artifactId = project.findProperty("maven.artifactId")?.toString() ?: project.name
            version = project.version.toString()
        }
    }
}