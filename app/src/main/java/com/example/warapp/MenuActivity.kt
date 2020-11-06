package com.example.warapp

import android.graphics.drawable.AnimationDrawable
import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.menu_activity.*


class MenuActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.Q) /*--> for buttonPlay to animationDrawable*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        setContentView(R.layout.menu_activity)


        val animationDrawableBackground =
            layout_main.background as AnimationDrawable
        animationDrawableBackground.setEnterFadeDuration(2000)
        animationDrawableBackground.setExitFadeDuration(4000)
        animationDrawableBackground.start()

    }
}
