package com.sena.gosale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sena.gosale.databinding.ActivityClientesBinding
class ClientesActivity : AppCompatActivity() {


    private lateinit var binding: ActivityClientesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityClientesBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}