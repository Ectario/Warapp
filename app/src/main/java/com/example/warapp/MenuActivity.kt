package com.example.warapp

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.daimajia.androidanimations.library.*
import kotlinx.android.synthetic.main.menu_activity.*


class MenuActivity : AppCompatActivity() {
    private var isMute = false //by default the sound is open
    private var isOtherActivityOpen = false //If the user spam Play or settings that don't start lot of activities

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

        buttonSettings.setOnClickListener {
            YoYo.with(Techniques.FlipInX)
                .onEnd {
                    if(!isOtherActivityOpen){
                        var newIntent = Intent(applicationContext, SettingsActivity::class.java)
                        startActivity(newIntent)
                        isOtherActivityOpen = true
                    }
                }
                .duration(700)
                .playOn(buttonSettings)
        }

        buttonPlay.setOnClickListener {
            YoYo.with(Techniques.FlipInX)
                .onEnd {
                    if(!isOtherActivityOpen){
                        var newIntent = Intent(applicationContext, GameActivity::class.java)
                        startActivity(newIntent)
                        isOtherActivityOpen = true
                    }
                }
                .duration(700)
                .playOn(buttonPlay)
        }

        buttonMute.setOnClickListener {
            YoYo.with(Techniques.FlipInY)
                .duration(700)
                .playOn(buttonMute)

            isMute = !isMute

            if(isMute){ //We change the color of buttonMute
                buttonMute.text = "MUTE"
                buttonMute.setBackgroundResource(R.drawable.custom_button_2)
            }else {
                buttonMute.text = "UNMUTE"
                buttonMute.setBackgroundResource(R.drawable.custom_button_3)
            }
        }
    }

    override fun onStart() {
        super.onStart()
        isOtherActivityOpen = false
    }
}

