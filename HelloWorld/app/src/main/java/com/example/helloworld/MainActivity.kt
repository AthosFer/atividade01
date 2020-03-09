package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlin.Double

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numb1 = findViewById<EditText>(R.id.number1)
        val numb2 = findViewById<EditText>(R.id.number2)
        val soma = findViewById<Button>(R.id.btsoma)
        val subt = findViewById<Button>(R.id.btsubt)
        val mult = findViewById<Button>(R.id.btmult)
        val divis = findViewById<Button>(R.id.btdiv)
        val res: Double
        soma.setOnClickListener {
            val numb1 = findViewById<EditText>(R.id.number1)
            val numb2 = findViewById<EditText>(R.id.number2)
            res = (numb1.text.toString().toInt() + numb2.text.toString().toInt()).toDouble()
            Toast.makeText(this,"$res",Toast.LENGTH_SHORT).show()
        }
        subt.setOnClickListener {
            val numb1 = findViewById<EditText>(R.id.number1)
            val numb2 = findViewById<EditText>(R.id.number2)
            res = (numb1.text.toString().toInt() - numb2.text.toString().toInt()).toDouble()
            Toast.makeText(this,"$res",Toast.LENGTH_SHORT).show()
        }
        mult.setOnClickListener {
            val numb1 = findViewById<EditText>(R.id.number1)
            val numb2 = findViewById<EditText>(R.id.number2)
            res = (numb1.text.toString().toInt() * numb2.text.toString().toInt()).toDouble()
            Toast.makeText(this,"$res",Toast.LENGTH_SHORT).show()
        }
        divis.setOnClickListener {
            val numb1 = findViewById<EditText>(R.id.number1)
            val numb2 = findViewById<EditText>(R.id.number2)
            res = (numb1.text.toString().toInt() / numb2.text.toString().toInt()).toDouble()
            Toast.makeText(this,"$res",Toast.LENGTH_SHORT).show()
        }
    }
}
