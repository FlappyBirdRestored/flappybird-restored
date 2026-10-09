plugins {
    id("com.android.application")
}

android {
    namespace = "com.dotgears.flappybird"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.dotgears.flappybird"
        minSdk = 21
        targetSdk = 35
        versionCode = 4
        versionName = "1.3"

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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    testOptions {
        unitTests.isReturnDefaultValues = true
    }
}

dependencies {
    implementation("androidx.annotation:annotation:1.8.2")
    testImplementation("junit:junit:4.13.2")
}
