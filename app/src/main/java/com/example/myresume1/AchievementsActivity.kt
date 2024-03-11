package com.example.myresume1

import android.widget.TextView
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class AchievementsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_achievements)

        // Display achievements information
        val achievementsDetails = "Swahilipot hackathon winner"
        val achievementsTextView: TextView = findViewById(R.id.achievementsDetailsTextView)
        achievementsTextView.text = achievementsDetails
    }
}
