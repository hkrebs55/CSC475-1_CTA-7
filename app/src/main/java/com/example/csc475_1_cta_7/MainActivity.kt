package com.example.csc475_1_cta_7

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.dryButton).setOnClickListener {
            val intent = Intent(this@MainActivity, DryMeasurementsActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.wetButton).setOnClickListener {
            val intent = Intent(this@MainActivity, WetMeasurementsActivity::class.java)
            startActivity(intent)
        }
    }
}