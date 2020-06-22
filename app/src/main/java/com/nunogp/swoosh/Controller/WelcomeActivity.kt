package com.nunogp.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.nunogp.swoosh.R
import kotlinx.android.synthetic.main.activity_welcome.*
//substitui AppCompatActivity por BaseActivity para herdar
//class LeagueActivity : AppCompatActivity() {
class WelcomeActivity: BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        // clicar det started passar 2º screen
        getStartedBtn.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}
