package com.jaredpage.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.jaredpage.swoosh.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        getStartedBtn.setOnClickListener{
            val leagueIntent = Intent(this, LeagueActivity::class.java) //intent allows you to interact with other applications and your own, this is explicit - in own app
            startActivity(leagueIntent)
        }
    }
}