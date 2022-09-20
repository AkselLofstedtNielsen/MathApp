package com.example.uppdatedmathapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var questionText : TextView

    lateinit var answerText: TextView
    var correctanswer = 0
    var firstNumber = (1..10).random()

    var secondNumber = (1..10).random()
    var score = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        questionText = findViewById(R.id.questionText)

        answerText = findViewById(R.id.answerText)

        val buttonAdd = findViewById<Button>(R.id.buttonAdd)
        buttonAdd.setOnClickListener {

            setNewQuestion()
            addQuestion()

        }

        val buttonMult = findViewById<Button>(R.id.buttonMult)
        buttonMult.setOnClickListener {

            setNewQuestion()
            multQuestion()

        }

        val buttonSub = findViewById<Button>(R.id.buttonSub)
        buttonSub.setOnClickListener {

            setNewQuestion()
            subQuestion()

        }

        val buttonCorrect = findViewById<Button>(R.id.buttonCorrect)

        buttonCorrect.setOnClickListener{
            correctButton()
        }
        val numberButton1 = findViewById<Button>(R.id.numberButton1)

        numberButton1.setOnClickListener {
            var oldtext = answerText.text
            var buttonText = numberButton1.text.toString()
            val newText = ("$oldtext$buttonText")
            answerText.text = newText
        }
        val numberButton2 = findViewById<Button>(R.id.numberButton2)

        numberButton2.setOnClickListener {
            var oldtext = answerText.text
            var buttonText = numberButton2.text.toString()
            val newText = ("$oldtext$buttonText")
            answerText.text = newText
        }
        val numberButton3 = findViewById<Button>(R.id.numberButton3)

        numberButton3.setOnClickListener {
            var oldtext = answerText.text
            var buttonText = numberButton3.text.toString()
            val newText = ("$oldtext$buttonText")
            answerText.text = newText
        }
        val numberButton4 = findViewById<Button>(R.id.numberButton4)

        numberButton4.setOnClickListener {
            var oldtext = answerText.text
            var buttonText = numberButton4.text.toString()
            val newText = ("$oldtext$buttonText")
            answerText.text = newText
        }
        val numberButton5 = findViewById<Button>(R.id.numberButton5)

        numberButton5.setOnClickListener {
            var oldtext = answerText.text
            var buttonText = numberButton5.text.toString()
            val newText = ("$oldtext$buttonText")
            answerText.text = newText
        }
        val numberButton6 = findViewById<Button>(R.id.numberButton6)

        numberButton6.setOnClickListener {
            var oldtext = answerText.text
            var buttonText = numberButton6.text.toString()
            val newText = ("$oldtext$buttonText")
            answerText.text = newText
        }
        val numberButton7 = findViewById<Button>(R.id.numberButton7)

        numberButton7.setOnClickListener {
            var oldtext = answerText.text
            var buttonText = numberButton7.text.toString()
            val newText = ("$oldtext$buttonText")
            answerText.text = newText
        }
        val numberButton8 = findViewById<Button>(R.id.numberButton8)

        numberButton8.setOnClickListener {
            var oldtext = answerText.text
            var buttonText = numberButton8.text.toString()
            val newText = ("$oldtext$buttonText")
            answerText.text = newText
        }
        val numberButton9 = findViewById<Button>(R.id.numberButton9)

        numberButton9.setOnClickListener {
            var oldtext = answerText.text
            var buttonText = numberButton9.text.toString()
            val newText = ("$oldtext$buttonText")
            answerText.text = newText
        }
        val numberButton0 = findViewById<Button>(R.id.numberButton0)

        numberButton0.setOnClickListener {
            var oldtext = answerText.text
            var buttonText = numberButton0.text.toString()
            val newText = ("$oldtext$buttonText")
            answerText.text = newText
        }


    }

    fun checkAnswer():Boolean{
        val answer = answerText.text.toString().toIntOrNull()

        return answer == correctanswer
    }

    fun correctButton(){

        if (checkAnswer()){
            score++
        }
        val answeredCorrect = checkAnswer()

      val intent = Intent(this, CorrectActivity::class.java)
        intent.putExtra("answeredCorrect",answeredCorrect)
        intent.putExtra("score",score)
        startActivity(intent)
        answerText.text = ""
    }


    fun addQuestion (){

        correctanswer = firstNumber + secondNumber
        questionText.text = "$firstNumber + $secondNumber =?"

    }
    fun multQuestion (){

        correctanswer = firstNumber * secondNumber
        questionText.text = "$firstNumber * $secondNumber =?"

    }
    fun subQuestion (){

        correctanswer = firstNumber - secondNumber
        questionText.text = "$firstNumber - $secondNumber =?"

    }
    fun setNewQuestion(){
        firstNumber = (1..10).random()
        secondNumber = (1..10).random()
    }


}