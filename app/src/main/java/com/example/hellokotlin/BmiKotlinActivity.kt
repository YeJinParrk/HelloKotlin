package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text
import java.lang.Exception

class BmiKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_view_binding);

        val heightFeild = findViewById<EditText>(R.id.heightFeild)
        val weightFeild = findViewById<EditText>(R.id.weightFeild)
        val btnBmi = findViewById<Button>(R.id.btnBmi)
        val txtResult = findViewById<TextView>(R.id.txtResult)

        btnBmi.setOnClickListener{
/*            val height = heightFeild.getText().toString().toDouble()
            val weight = weightFeild.getText().toString().toDouble()*/
            val sheight = heightFeild.getText().toString()
            val sweight = weightFeild.getText().toString()
            try {
                val bmi = sweight.toDouble() / Math.pow(sheight.toDouble() / 100.0, 2.0)
                txtResult.setText("Your BMI = " + bmi)
            }catch (e : Exception){
                txtResult.setText("Input(s) missing")
            }
        }
    }
}