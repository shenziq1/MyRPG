package com.github.shenziq1.myrpg.android

import android.os.Bundle

import com.badlogic.gdx.backends.android.AndroidApplication
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration
import com.github.shenziq1.myrpg.MyRPG

/** Launches the Android application. */
class AndroidLauncher : AndroidApplication() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initialize(MyRPG(), AndroidApplicationConfiguration().apply {
            // Configure your application here.
        })
    }
}
