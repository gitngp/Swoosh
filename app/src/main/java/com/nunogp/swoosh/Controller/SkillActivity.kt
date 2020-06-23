package com.nunogp.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.nunogp.swoosh.Model.Player
//import com.nunogp.swoosh.Utilities.EXTRA_LEAGUE
import com.nunogp.swoosh.R
import com.nunogp.swoosh.Utilities.EXTRA_PLAYER
//import com.nunogp.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    //var league = ""
    //var skill=""
    //say will initialize later
    lateinit var player : Player

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        //league = intent.getStringExtra(EXTRA_LEAGUE)
        //println(league)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null){
            player = savedInstanceState.getParcelable<Player>(EXTRA_PLAYER)!!
        }
    }


    fun onBallerClick(view: View){
        beginnerSkillBtn.isChecked=false
        //skill="baller"
        player.skill = "baller"
    }

    fun onBegginerClick(view: View){
        ballerSkillBtn.isChecked=false
        //skill="begginer"
        player.skill = "begginer"
    }

    fun onSkillFinishClick(view: View) {
        //if (skill != "") {
        if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            //finishActivity.putExtra(EXTRA_LEAGUE, league)
            //finishActivity.putExtra(EXTRA_SKILL, skill)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this,"select skill level" ,Toast.LENGTH_SHORT).show()
        }
    }
}