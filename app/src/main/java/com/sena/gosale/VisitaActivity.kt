package com.sena.gosale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.TableLayout
import android.widget.TextView
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.sena.gosale.databinding.ActivityVisitaBinding
import org.json.JSONException

class VisitaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVisitaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVisitaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtUser.setOnClickListener{ user1() }
        binding.txtUser2.setOnClickListener{ user2() }
        binding.txtUser3.setOnClickListener{ user3() }

    }

    private fun user1() {
        val ventanaUser = Intent(this, VisitaActivity2::class.java)
        startActivity(ventanaUser)

        Toast.makeText(applicationContext, "Cliente!", Toast.LENGTH_SHORT).show()
    }

    private fun user2() {
        val ventanaUser = Intent(this, VisitaActivity2::class.java)
        startActivity(ventanaUser)

        Toast.makeText(applicationContext, "Cliente!", Toast.LENGTH_SHORT).show()
    }

    private fun user3() {
        val ventanaUser = Intent(this, VisitaActivity2::class.java)
        startActivity(ventanaUser)

        Toast.makeText(applicationContext, "Cliente!", Toast.LENGTH_SHORT).show()
    }
}