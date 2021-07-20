package com.uzun.the_calculator_tep

import android.os.Bundle
import android.text.TextWatcher
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.EditText
import com.uzun.the_calculator_tep.constants.GazConstants
import com.uzun.the_calculator_tep.R

class GazActivity: AppCompatActivity() {

    lateinit var etV: EditText
    lateinit var tvOutputVc: TextView
    lateinit var btnV: Button
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gaz)
         val tvVcFormula = findViewById<TextView>(R.id.textView_Vc_Formula)
         val tvVc = findViewById<TextView>(R.id.textView_Vc)
         val tvV = findViewById<TextView>(R.id.textView_V)
         val tvK = findViewById<TextView>(R.id.textView_K)
         val btnV = findViewById<Button>(R.id.button)
         tvOutputVc = findViewById<TextView>(R.id.text_view_output_Vс)
         etV= findViewById<EditText>(R.id.edit_text_enter_V)

         btnV.setOnClickListener({
             tvOutputVc.text = etV.text
         })

//         etV.addTextChangedListener(object :TextWatcher{
//             override fub onTextCganged(s: )
//         })
    }


}