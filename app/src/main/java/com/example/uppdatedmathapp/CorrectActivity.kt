package com.example.uppdatedmathapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class CorrectActivity : AppCompatActivity() {

    lateinit var resultTextView: TextView
    lateinit var newImage : ImageView
    lateinit var scoreText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_correct)

        resultTextView = findViewById(R.id.resultTextView)
        newImage = findViewById(R.id.starImage)
        scoreText = findViewById(R.id.textViewScore)

        val answer = intent.getBooleanExtra("answeredCorrect" , false)
        val score = intent.getIntExtra("score",0).toString()
        val button = findViewById<Button>(R.id.backButton)

        button.setOnClickListener {
            finish()
        }

        scoreText.text = "Score = $score"
        if(answer){
            resultTextView.text = "Rätt svar!"
            newImage.setImageResource(R.drawable.c1)


        }else {
            resultTextView.text = "Fel svar!"
            newImage.setImageResource(R.drawable.c2)
        }



    }
}