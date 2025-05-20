package com.example.introkotlin903

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin903.practica1.saludoActivity
import com.example.introkotlin903.practica2.OperasActivity

class MenuActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu2)

        val btnSaludo = findViewById<Button>(R.id.btn1)

        val btnOperaciones = findViewById<Button>(R.id.btn2)

        btnSaludo.setOnClickListener{navegateToSaludo()}

        btnOperaciones.setOnClickListener{navegateToOperaciones()}



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}

private fun MenuActivity2.navegateToSaludo() {
    val intent = Intent(this, saludoActivity::class.java)
    startActivity(intent)
}

private fun MenuActivity2.navegateToOperaciones() {
    val intent = Intent(this, OperasActivity::class.java)
    startActivity(intent)
}
