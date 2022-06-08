package com.jaredpage.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jaredpage.swoosh.EXTRA_LEAGUE
import com.jaredpage.swoosh.EXTRA_SKILL
import com.jaredpage.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.text = "Looking for $league $skill league near you..."
    }
}