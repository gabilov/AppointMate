plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = 34

    defaultConfig {
        applicationId = "com.appointmate.app"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

kapt {
    arguments {
        arg("dagger.hilt.android.internal.disableAndroidSuperclassValidation", "true")
    }
}

hilt {
    enableAggregatingTask = true
}