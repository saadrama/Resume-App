package com.example.myresume1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity

class LandingActivity : AppCompatActivity() {

    @SuppressLint("CutPasteId", "SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)


        val mydetailsButton: Button=findViewById(R.id.mydetailsButton)
        mydetailsButton.setOnClickListener{
            startActivity(Intent(this, MydetailsActivity::class.java))
        }


        val educationButton: Button = findViewById(R.id.educationButton)
        educationButton.setOnClickListener {
            startActivity(Intent(this, EducationActivity::class.java))
        }

        val skillsButton: Button = findViewById(R.id.skillsButton)
        skillsButton.setOnClickListener {
            startActivity(Intent(this, SkillsActivity::class.java))
        }

        val experienceButton: Button = findViewById(R.id.experienceButton)
        experienceButton.setOnClickListener {
            startActivity(Intent(this, ExperienceActivity::class.java))
        }

        val achievementsButton: Button = findViewById(R.id.achievementsButton)
        achievementsButton.setOnClickListener {
            startActivity(Intent(this, AchievementsActivity::class.java))
        }

        val refereesButton: Button = findViewById(R.id.refereesButton)
        refereesButton.setOnClickListener {
            startActivity(Intent(this, RefereesActivity::class.java))
        }

    }
}
