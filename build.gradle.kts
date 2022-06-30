// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    extra["kotlin_version"] = "1.7.0"
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${project.extra["kotlin_version"]}")
        classpath("com.android.tools.build:gradle:7.3.0-beta04")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
        classpath("com.google.gms:google-services:4.3.10")  // Firebase SDK
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()

        maven {
            // Adding Kakao SDK Repo
            setUrl("https://devrepo.kakao.com/nexus/content/groups/public/")
        }
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}