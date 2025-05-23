package com.example.introkotlin903.ejemplo1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin903.R
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class CinepolisActivity : AppCompatActivity() {


    private lateinit var nombreEditText: EditText
    private lateinit var compradoresEditText: EditText
    private lateinit var boletosEditText: EditText
    private lateinit var tarjetaSi: RadioButton
    private lateinit var tarjetaNo: RadioButton
    private lateinit var totalTextView: TextView
    private lateinit var calcularBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cinepolis)

        nombreEditText = findViewById(R.id.editTextText)
        compradoresEditText = findViewById(R.id.editTextNumber2)
        boletosEditText = findViewById(R.id.editTextNumber)
        tarjetaSi = findViewById(R.id.radioButton)
        tarjetaNo = findViewById(R.id.radioButton2)
        totalTextView = findViewById(R.id.textView8)
        calcularBtn = findViewById(R.id.button3)

        calcularBtn.setOnClickListener {
            calcularTotal()
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun calcularTotal() {
        val nombre = nombreEditText.text.toString()
        val compradores = compradoresEditText.text.toString().toIntOrNull()
        val boletos = boletosEditText.text.toString().toIntOrNull()

        if (nombre.isEmpty() || compradores == null || boletos == null) {
            totalTextView.text = "Completa todos los campos correctamente."
            return
        }

        if (boletos > compradores * 7) {
            totalTextView.text = "Máximo 7 boletos por persona."
            return
        }

        var precioTotal = boletos * 12.0

        // Descuento por cantidad
        precioTotal *= when {
            boletos > 5 -> 0.85  // 15%
            boletos in 3..5 -> 0.90  // 10%
            else -> 1.0
        }

        // Descuento adicional por tarjeta
        if (tarjetaSi.isChecked) {
            precioTotal *= 0.90  // 10% adicional
        }

        totalTextView.text = "$nombre paga: $%.2f".format(precioTotal)
    }
}