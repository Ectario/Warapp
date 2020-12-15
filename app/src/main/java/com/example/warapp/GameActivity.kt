package com.example.warapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.`object`.Grid
import com.example.engine.GameView
import kotlinx.android.synthetic.main.activity_game.*

class GameActivity : AppCompatActivity() {
    lateinit var grid : Grid

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        var gameView = GameView(this)
        setContentView(gameView)
        grid = Grid(10,20)
        println(grid.gridToString());

    }
}