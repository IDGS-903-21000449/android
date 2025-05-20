package com.example.introkotlin903.practica2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin903.R

class OperasActivity : AppCompatActivity() {

    private lateinit var edt1: EditText
    private lateinit var edt2: EditText
    private lateinit var btn1: Button
    private lateinit var tv1: TextView
    private lateinit var radSuma: RadioButton
    private lateinit var radResta: RadioButton
    private lateinit var radMul: RadioButton
    private lateinit var radDiv: RadioButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_operas)

        radSuma = findViewById(R.id.radSuma)
        radResta = findViewById(R.id.radResta)
        radMul = findViewById(R.id.radMul)
        radDiv = findViewById(R.id.radDiv)


        edt1 = findViewById(R.id.edt1)
        edt2 = findViewById(R.id.edt2)
        btn1 = findViewById(R.id.button2)
        tv1 = findViewById(R.id.tv1)



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun calcular(View: android.view.View) {
        val num1 = edt1.text.toString().toDouble()
        val num2 = edt2.text.toString().toDouble()
        var resultado: Double = 0.0

        if(radSuma.isChecked) {
            resultado = num1 + num2
        } else if(radResta.isChecked) {
            resultado = num1 - num2
        } else if(radMul.isChecked) {
            resultado = num1 * num2
        } else if(radDiv.isChecked) {
            resultado = num1 / num2
        }

        val result1 = "Resultado: $resultado"
        tv1.text = result1
    }
}