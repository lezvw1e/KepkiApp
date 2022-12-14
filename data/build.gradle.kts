plugins {
    id (Dependencies.Plugins.androidApplication)
    id (Dependencies.Plugins.googleDaggerHilt)
    id (Dependencies.Plugins.kotlinKapt)
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.data"
    compileSdk = 32

    defaultConfig {
        minSdk = 26
        targetSdk = 32

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.appcompat:appcompat:1.5.1")
    implementation("com.google.android.material:material:1.7.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")

    // Networking
    val retrofit_version = "2.9.0"
    val okhttp_version = "4.7.2"
    implementation ("com.squareup.retrofit2:converter-gson:$retrofit_version")
    implementation ("com.squareup.retrofit2:retrofit:$retrofit_version")
    implementation ("com.squareup.okhttp3:okhttp:$okhttp_version")
    implementation ("com.squareup.okhttp3:logging-interceptor:$okhttp_version")

    //Domain module
    implementation(project(":domain"))

    //Core module
    implementation(project(":core"))
    implementation(project(":core_ui"))

    // Dagger-Hilt
    implementation (Dependencies.DaggerHilt.daggerHiltAndroid)
    kapt (Dependencies.DaggerHilt.daggerHiltCompiler)

}