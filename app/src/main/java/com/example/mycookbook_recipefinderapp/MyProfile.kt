package com.example.mycookbook_recipefinderapp

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MyProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_my_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnhome= findViewById<LinearLayout>(R.id.btnHome)
        btnhome.setOnClickListener {
            startActivity(Intent(this, HomePage::class.java))
            finish()
        }

        val btncategory= findViewById<LinearLayout>(R.id.btnCategory)
        btncategory.setOnClickListener {
            startActivity(Intent(this, CategoryPage::class.java))
            finish()
        }

        val btnmyRecipe= findViewById<LinearLayout>(R.id.btnMyRecipe)
        btnmyRecipe.setOnClickListener {
            startActivity(Intent(this, MyRecipePage::class.java))
            finish()
        }

        val btnprofile= findViewById<LinearLayout>(R.id.btnProfile)
        btnprofile.setOnClickListener {
            startActivity(Intent(this, MyProfile::class.java))
            finish()
        }
    }
}