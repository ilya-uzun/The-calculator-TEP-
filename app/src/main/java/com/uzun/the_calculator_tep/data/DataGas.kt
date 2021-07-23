package com.uzun.the_calculator_tep.data

data class DataGas(var v: Double){
    var valueCoeff = 0.0
    var value = 0.0
    var coeff = 1.0
    var  tempGasStandart = 20.0
    var  pressGasStandart = 1.01325
    var  coeffCompressGas = 0.9873

    fun calculationValue(){
        calculationCoefficient()
        valueCoeff = value * coeff
    }

    private fun calculationCoefficient(){
        val p: Double = 1.0 // Измеренная даление дабавить через EditText, уточнить еденицы времмено в бар
        val t: Double = 15.0 // Измеренная температура дабавить через EditText
        coeff = (1 / coeffCompressGas) * (p / pressGasStandart)  * (t / tempGasStandart)
    }
}

