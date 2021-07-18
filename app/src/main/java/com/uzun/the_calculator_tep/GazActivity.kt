package com.uzun.the_calculator_tep

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.uzun.the_calculator_tep.R

class GazActivity: AppCompatActivity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gaz)

        val tvVcFormula = findViewById<TextView>(R.id.textView_Vc_Formula)
        val tvVc = findViewById<TextView>(R.id.textView_Vc)
        val tvV = findViewById<TextView>(R.id.textView_V)
        val tvK = findViewById<TextView>(R.id.textView_K)

    }
}