package com.sena.gosale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sena.gosale.databinding.ActivityVisitaAgendaBinding
import java.util.*

class VisitaAgendaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVisitaAgendaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVisitaAgendaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.etDate.setOnClickListener {showDatePickDialog()}
    }
    //-------funcion que ejecute el DatePicker
    private fun showDatePickDialog() {
        val datePicker = DatePickerFragment { day, month, year -> onDateSelected(day, month, year) }
        datePicker.show(supportFragmentManager, "datePicker")
    }

    fun onDateSelected(day:Int, month:Int, year:Int){
        binding.etDate.setText("$day / $month / $year")
    }
}
