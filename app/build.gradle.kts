plugins {
    id("com.android.application")
}

android {
    namespace = "com.fabiansuarez.tiendavirtual"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.fabiansuarez.tiendavirtual"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.activity:activity:1.8.2")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    //implementacion de los colores ===> https://github.com/yukuku/ambilwarna
    implementation("com.github.yukuku:ambilwarna:2.0.1")
    //implementacion picaso para la gestion de imagenes
    implementation("com.squareup.picasso:picasso:2.71828")
    implementation("de.hdodenhof:circleimageview:3.1.0")
    //implementacion del slider de las imágenes
    implementation ("com.github.denzcoskun:ImageSlideshow:0.1.2")


}