package com.uzun.the_calculator_tep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.uzun.the_calculator_tep.R

class MainActivity : AppCompatActivity() {
    //Создание элементов
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val btnGaz = findViewById<Button>(R.id.button_GazActuvity)
        btnGaz.setOnClickListener(this::onBtnGaz)
    }

    private fun onBtnGaz(view: View) {
        val intent = Intent(this, GazActivity::class.java)
        startActivity(intent)
    }
}