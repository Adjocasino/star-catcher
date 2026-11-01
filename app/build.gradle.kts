plugins {
    id("com.android.application")
}

android {
    namespace = "com.flipguy.game"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.flipguy.game"
        minSdk = 26
        targetSdk = 34
        versionCode = 8
        versionName = "1.7"
    }

    buildTypes {
        release { isMinifyEnabled = false }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
