plugins {
    id (Dependencies.Plugins.androidApplication)
    id (Dependencies.Plugins.googleDaggerHilt)
    id (Dependencies.Plugins.kotlinKapt)
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = ("com.example.kepkiapp")
    compileSdk = 32

    defaultConfig {
        applicationId = "com.example.kepkiapp"
        minSdk = 26
        targetSdk  = 32
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles (getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {


    implementation (Dependencies.UI.androidxCore)
    implementation (Dependencies.UI.androidxAppcompat)
    implementation (Dependencies.UI.androidMaterial)
    implementation (Dependencies.UI.androidConstraint)
    testImplementation (Dependencies.UI.junit)
    androidTestImplementation (Dependencies.UI.androidTest)
    androidTestImplementation (Dependencies.UI.androidTestEspresso)

    //LiveData
    implementation (Dependencies.LiveData.lifecycleLiveData)
    implementation (Dependencies.LiveData.lifecycleViewModel)

    //Navigation
    implementation (Dependencies.Navigation.navigationFragment)
    implementation (Dependencies.Navigation.navigationUIKts)

    //room
    implementation (Dependencies.Room.roomRuntime)
    annotationProcessor (Dependencies.Room.roomCompiler)
    kapt(Dependencies.Room.roomKaptCompiler)
    implementation(Dependencies.Room.roomKtx)

    //Viewpager Implementation
    implementation ("androidx.viewpager2:viewpager2:1.0.0")

    //CircleIndicator
    implementation ("me.relex:circleindicator:2.1.6")

    //glide dependency
    implementation ("com.github.bumptech.glide:glide:4.13.2")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.13.2")


    // Coroutines
    implementation (Dependencies.Coroutines.kotlinxCoroutines)

    // Dagger-Hilt
    implementation (Dependencies.DaggerHilt.daggerHiltAndroid)
    kapt (Dependencies.DaggerHilt.daggerHiltCompiler)

    //CoreUI module
    implementation(project(":core_ui"))

    implementation(project(":data"))

    implementation(project(":core"))

    implementation(project(":domain"))

    // Networking
    val retrofit_version = "2.9.0"
    val okhttp_version = "4.7.2"
    implementation ("com.squareup.retrofit2:converter-gson:$retrofit_version")
    implementation ("com.squareup.retrofit2:retrofit:$retrofit_version")
    implementation ("com.squareup.okhttp3:okhttp:$okhttp_version")
    implementation ("com.squareup.okhttp3:logging-interceptor:$okhttp_version")
}