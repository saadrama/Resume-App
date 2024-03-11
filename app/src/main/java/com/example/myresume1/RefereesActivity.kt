package com.example.myresume1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RefereesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_referees)

        // Display referees information
        val refereesDetails = "MR Alianda\nCompany TSCONECT\nContact: alienda.te@example.com"
        val refereesDetailsTextView: TextView= findViewById(R.id.refereesDetailsTextView)
        refereesDetailsTextView.text = refereesDetails
    }
}
