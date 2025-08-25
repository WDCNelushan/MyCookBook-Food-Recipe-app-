package com.example.mycookbook_recipefinderapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RecipeInstructionPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recipe_instruction_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val back= findViewById<ImageButton>(R.id.btnBack)
        back.setOnClickListener {
            startActivity(Intent(this, CategoryPage::class.java))
            finish()
        }

        val ingredient= findViewById<LinearLayout>(R.id.btnIngredients)
        ingredient.setOnClickListener {
            startActivity(Intent(this, RecipeIngrediantPage::class.java))
            finish()
        }

        val instruction= findViewById<LinearLayout>(R.id.btnInstructions)
        instruction.setOnClickListener {
            startActivity(Intent(this, RecipeInstructionPage::class.java))
            finish()
        }

        val reviews= findViewById<LinearLayout>(R.id.btnReviews)
        reviews.setOnClickListener {
            startActivity(Intent(this, ReviewsPage::class.java))
            finish()
        }

        val about= findViewById<LinearLayout>(R.id.btnAbout)
        about.setOnClickListener {
            startActivity(Intent(this, AboutPage::class.java))
            finish()
        }
    }
}