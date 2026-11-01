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
        versionCode = 6
        versionName = "1.5"
    }

    buildTypes {
        release { isMinifyEnabled = false }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
