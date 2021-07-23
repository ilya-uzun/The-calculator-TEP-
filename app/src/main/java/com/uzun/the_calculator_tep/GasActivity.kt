package com.uzun.the_calculator_tep

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.EditText
import android.widget.Toast
import com.uzun.the_calculator_tep.data.GasConstants
import com.uzun.the_calculator_tep.calculation.Gas

class GasActivity: AppCompatActivity() {

    lateinit var etV: EditText
    lateinit var tvOutputVc: TextView

     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_gaz)
         val tvVcFormula = findViewById<TextView>(R.id.textView_Vc_Formula)
         val tvVc = findViewById<TextView>(R.id.textView_Vc)
         val tvV = findViewById<TextView>(R.id.textView_V)
         val tvK = findViewById<TextView>(R.id.textView_K)
         etV= findViewById<EditText>(R.id.edit_text_enter_V)
         tvOutputVc = findViewById<TextView>(R.id.text_view_output_Vс)

         writeEtV()


    }//onCreate

    private fun writeEtV(){
        val gas = Gas()
        val warningMessage = "Введите значение"
        val toast = Toast.makeText(applicationContext, warningMessage, Toast.LENGTH_SHORT)

        etV.setOnClickListener {
            if (etV.getText().toString().equals("")) { // проверка длины строки
                toast.show()
            } else {
                val edText = etV.text.toString() // Преодразовываем
                GasConstants.COEFF.v = edText.toDouble()
                gas.calculationValue()
                tvOutputVc.text = GasConstants.VC.v.toString()
            }
        }
    }//writeEtV

}//GazActivity