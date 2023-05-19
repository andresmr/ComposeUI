plugins {
    id("org.jetbrains.compose")
    id("com.android.application")
    kotlin("android")
    id("kotlin-kapt")
}

group = "org.dhis2"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common"))
    implementation("androidx.activity:activity-compose:1.7.1")
    implementation ("com.airbnb.android:showkase:1.0.0-beta18")
    kapt ("com.airbnb.android:showkase-processor:1.0.0-beta18")
}

android {
    compileSdk = 33
    defaultConfig {
        applicationId = "org.dhis2.android"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0-SNAPSHOT"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}