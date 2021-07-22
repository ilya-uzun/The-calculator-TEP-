package com.uzun.the_calculator_tep.calculation

import com.uzun.the_calculator_tep.constants.GasConstants

class Gas {
    fun calculationValue(){
        calculationCoefficient()
        GasConstants.VALUE.v * GasConstants.COEFF.v
    }

   private fun calculationCoefficient(){
        val p: Double = 1.0 // Измеренная даление дабавить через EditText, уточнить еденицы времмено в бар
        val t: Double = 15.0 // Измеренная температура дабавить через EditText
       GasConstants.COEFF.v = (1 / GasConstants.COEFF_COMPRESS_GAZ.v) * (p / GasConstants.PESS_GAZ_STANDART.v)  * (t / GasConstants.TEMP_GAZ_STANDART.v)
    }
}