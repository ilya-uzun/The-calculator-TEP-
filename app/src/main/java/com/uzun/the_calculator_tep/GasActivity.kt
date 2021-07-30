package com.uzun.the_calculator_tep

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.EditText
import android.widget.Toast
import com.uzun.the_calculator_tep.data.GasConstants
import com.uzun.the_calculator_tep.calculation.Gas
import com.uzun.the_calculator_tep.data.DataGas

class GasActivity: AppCompatActivity() {

    lateinit var etV: EditText
    lateinit var etTemp: EditText
    lateinit var etPress: EditText
    lateinit var tvOutputVc: TextView
    var temp: Double = 1.0
    var gas = DataGas( writeEtTemp(), writeEtPress())

     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_gaz)
         val tvVcFormula = findViewById<TextView>(R.id.textView_Vc_Formula)
         val tvVc = findViewById<TextView>(R.id.textView_Vc)
         val tvV = findViewById<TextView>(R.id.textView_V)
         val tvK = findViewById<TextView>(R.id.textView_K)
         etV= findViewById<EditText>(R.id.edit_text_enter_V)
         etTemp= findViewById<EditText>(R.id.edit_text_enter_temp)
         etPress = findViewById<EditText>(R.id.edit_text_enter_press)
         tvOutputVc = findViewById<TextView>(R.id.text_view_output_Vс)

         writeEtV()

    }//onCreate
    // вво объема
    private fun writeEtV(){

        val warningMessage = "Введите значение"
        val toast = Toast.makeText(applicationContext, warningMessage, Toast.LENGTH_SHORT)

        etV.setOnClickListener {
            if (etV.getText().toString().equals("")) { // проверка длины строки
                toast.show()
            } else {
                val edText = etV.text.toString() // Преодразовываем
                gas.setCoeff(edText.toDouble())
                gas.calculationValue()
                val tvOutput = gas.calculationValue().toString()
               tvOutputVc.text = tvOutput

            }
        }
    }//writeEtV

    private fun writeEtTemp():Double{
        val warningMessage = "Введите значение"
        val toast = Toast.makeText(applicationContext, warningMessage, Toast.LENGTH_SHORT)
        val edText = etTemp.text.toString()
        etTemp.setOnClickListener {
            if (etTemp.getText().toString().equals("")) toast.show()
        }
        return edText.toDouble()
    }//writeEtPress

    private fun writeEtPress():Double{
        val warningMessage = "Введите значение"
        val toast = Toast.makeText(applicationContext, warningMessage, Toast.LENGTH_SHORT)
        val edText = etPress.text.toString()
        etPress.setOnClickListener {
            if (etPress.getText().toString().equals("")) toast.show()
        }
        return edText.toDouble()
    }//writeEtPress

}//GazActivity

//Задачи
//        Удалось сделать вывод результатов формулы
//        считет не правильно
//        Сделать од парраметров temp и press с EditText