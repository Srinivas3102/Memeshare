// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false

}

buildscript {
    repositories {
        google() // Add this line to access Google's Maven repository
        jcenter() // Add this line to access JCenter repository

    }

}




