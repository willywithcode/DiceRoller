package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton : Button =  findViewById(R.id.button)
        val textView : TextView = findViewById(R.id.textView)
        rollButton.setOnClickListener{
            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
            val dice = Dice(6)
            textView.text = dice.roll().toString()
        }
    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}