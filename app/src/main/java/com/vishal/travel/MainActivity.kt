package com.vishal.travel

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tvExplore.setOnClickListener {
            val i = Intent(this, ExploreActivity::class.java)
            startActivity(i)
        }

        social.setOnClickListener {
            val i = Intent(this, SocialMediaActivity::class.java)
            startActivity(i)
        }

        trip.setOnClickListener {
            val i = Intent(this, MyTripActivity::class.java)
            startActivity(i)
        }

    }
}