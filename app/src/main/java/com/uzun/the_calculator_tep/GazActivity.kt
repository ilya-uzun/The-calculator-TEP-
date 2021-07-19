package com.uzun.the_calculator_tep

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.EditText
import com.uzun.the_calculator_tep.constants.GazConstants
import com.uzun.the_calculator_tep.R

class GazActivity: AppCompatActivity() {

    private lateinit var etV: EditText
    var tvOutputVc: TextView? = null

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gaz)

        val tvVcFormula = findViewById<TextView>(R.id.textView_Vc_Formula)
        val tvVc = findViewById<TextView>(R.id.textView_Vc)
        val tvV = findViewById<TextView>(R.id.textView_V)
        val tvK = findViewById<TextView>(R.id.textView_K)
         tvOutputVc = findViewById<TextView>(R.id.text_view_output_Vс)
         etV= findViewById<EditText>(R.id.edit_text_enter_V)

         updateOutputVc()
    }


    private fun onEnterV(){

    }
    private  fun updateOutputVc(){
        tvOutputVc?.text = "${onEnterV()}"
    }
}