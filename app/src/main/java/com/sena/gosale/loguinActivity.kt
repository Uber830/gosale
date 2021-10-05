package com.sena.gosale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.sena.gosale.databinding.ActivityLoguinBinding

class loguinActivity : AppCompatActivity() {

     lateinit var loguin: ActivityLoguinBinding

    override fun onCreate(savedInstanceState: Bundle?) {
             //splashcreen
       // setTheme(R.style.Theme_Gosale)

        super.onCreate(savedInstanceState)
       loguin = ActivityLoguinBinding.inflate(layoutInflater)
        setContentView(loguin.root)

        loguin.buttonIngresar.setOnClickListener{ ingresar() }

       /* boton.setOnClickListener {
            /*concatena las salidas de informacion*/
           // val message = "Email: ${email.text}, Contraseña: ${password.text}"
           // val info = recuperar.text

            /* llama la activity de los productos*/
            val ventanaLogin = Intent(this, MainActivity::class.java)
            startActivity(ventanaLogin)

            /*Muestra los valores ingresados por pantalla, en la parte inferior*/
            Toast.makeText(this, "Ingreso", Toast.LENGTH_SHORT).show()
        }  */
    }

    private fun ingresar() {
        val ingreso = Intent(this, MainActivity::class.java)
        startActivity(ingreso)

        Toast.makeText(this, "Ingresando!", Toast.LENGTH_SHORT).show()
    }
}