plugins {
    id (Dependencies.Plugins.androidApplication)
    id (Dependencies.Plugins.googleDaggerHilt)
    id (Dependencies.Plugins.kotlinKapt)
    id("org.jetbrains.kotlin.android")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}
dependencies {

    implementation(project(":core"))

    // Coroutines
    implementation (Dependencies.Coroutines.kotlinxCoroutines)

    // Dagger-Hilt
    implementation (Dependencies.DaggerHilt.daggerHiltAndroid)
    kapt (Dependencies.DaggerHilt.daggerHiltCompiler)
}