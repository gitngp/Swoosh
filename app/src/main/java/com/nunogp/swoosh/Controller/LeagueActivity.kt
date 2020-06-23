package com.nunogp.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.nunogp.swoosh.Model.Player
//import com.nunogp.swoosh.Utilities.EXTRA_LEAGUE
import com.nunogp.swoosh.R
import com.nunogp.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

//substitui AppCompatActivity por BaseActivity para herdar
//class LeagueActivity : AppCompatActivity() {
class LeagueActivity : BaseActivity() {

    //var selectedLeague = ""
    var player = Player ("", "")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View){
        womensLeagueBtn.isChecked=false
        coedLeagueBtn.isChecked=false
        //selectedLeague="mens"
        player.league = "mens"
    }

    fun onWomensClicked(view: View){
        mensLeagueBtn.isChecked=false
        coedLeagueBtn.isChecked=false
        //selectedLeague="womens"
        player.league = "womens"
    }

    fun onCoedClicked(view: View){
        mensLeagueBtn.isChecked=false
        womensLeagueBtn.isChecked=false
        //selectedLeague="co-ed"
        player.league = "co-ed"
    }

    fun leagueNextClicked(view: View) {

        //if (selectedLeague != "") {
            if (player.league !=""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            //send selectedLeague to next page screen .putextra parcelable
            skillActivity.putExtra(EXTRA_PLAYER, player)
            //)skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        }else{
            //warn popup
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }
}