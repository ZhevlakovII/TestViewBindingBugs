plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.testviewbindingbugs.external"
    compileSdk = 35

    defaultConfig {
        minSdk = 21
        //noinspection OldTargetApi
        targetSdk = 35
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
    kotlinOptions {
        jvmTarget = "21"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation("androidx.fragment:fragment-ktx:1.8.7")
    implementation("androidx.constraintlayout:constraintlayout:2.2.1")
}