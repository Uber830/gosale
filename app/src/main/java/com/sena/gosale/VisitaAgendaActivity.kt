package com.sena.gosale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import java.util.*

class VisitaAgendaActivity : AppCompatActivity() {
    val fecha = findViewById<EditText>(R.id.etDate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visita_agenda)

     fecha.setOnClickListener {showDatePickDialog()}
    }
    //funcion que ejecute el DatePicker
    private fun showDatePickDialog() {
        val datePicker = DatePickerFragment { day, month, year -> onDateSelected(day, month, year) }
        datePicker.show(supportFragmentManager, "datePicker")
    }

    fun onDateSelected(day:Int, month:Int, year:Int){
        fecha.setText("$day / $month / $year")
    }
}
