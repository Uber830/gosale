package com.sena.gosale

import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class NewToolbar {
    fun show(activities: AppCompatActivity, title: String, upButton: Boolean) {
        activities.setSupportActionBar (activities.findViewById(R.id.SHOW_PROGRESS))
        activities.supportActionBar?.title = title
        activities.supportActionBar?.setDisplayHomeAsUpEnabled(upButton)
    }
}