package com.sena.gosale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class loguinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //codigo del splashcreen
        setTheme(R.style.Theme_Gosale)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loguin)

        //variables
        val email = findViewById<EditText>(R.id.hint_Email)
        val password = findViewById<EditText>(R.id.hint_Password)
        val sendButton = findViewById<Button>(R.id.button_Ingresar)
        val recuperar = findViewById<TextView>(R.id.text_RecuperarContraseña)

        sendButton.setOnClickListener {
            /*concatena las salidas de informacion*/
            val message = "Email: ${email.text}, Contraseña: ${password.text}"
            val info = recuperar.text

            /* llama la activity de los productos*/
            val ventanaLogin = Intent(this, MainActivity::class.java)
            startActivity(ventanaLogin)

            /*Muestra los valores ingresados por pantalla, en la parte inferior*/
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }
}