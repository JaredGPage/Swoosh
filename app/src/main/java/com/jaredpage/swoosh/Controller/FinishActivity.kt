package com.jaredpage.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jaredpage.swoosh.EXTRA_PLAYER
import com.jaredpage.swoosh.Model.Player
import com.jaredpage.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        if (player != null) {
            searchLeaguesText.text = "Looking for ${player.league} ${player.skill} league near you..."
        }
    }
}