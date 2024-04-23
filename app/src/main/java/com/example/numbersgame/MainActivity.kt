package com.example.numbersgame

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var button2: Button
    lateinit var display: TextView
    lateinit var textField: EditText
    var number: Int = 0
    var guess: Int = 0


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        number = Random.nextInt(0, 11)
        println("Random number: $number")

        button = findViewById(R.id.press)
        button2 = findViewById(R.id.redo)
        display = findViewById(R.id.view)
        textField = findViewById(R.id.enter)

        display.text = "Guess number between 0 - 10"

        button.setOnClickListener {
            guess = textField.text.toString().toInt()


            if (guess == number) {
                display.text = "Guess was correct :Random number is $number"
            } else if (guess > number) {
                display.text = "Random was greater than number: $number"
            } else if (guess < number) {
                display.text = "Random was less than number: $number"
            }

        }

        button2.setOnClickListener {
            textField.text.clear()
            number = Random.nextInt(0, 11)
            println("Random number: $number")
            display.text = "Guess number between 0 - 10"
        }


    }
}


