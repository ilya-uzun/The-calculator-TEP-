package com.uzun.the_calculator_tep.data

data class DataGas(var temp: Double, var press: Double){
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

        // проверка деления на  ноль
        if (temp == 0.0 || press == 0.0) {
            temp = 0.1
            press = 0.1
        } else {
            coeff = (1 / coeffCompressGas) * (p / pressGasStandart)  * (t / tempGasStandart)
        }
    }

}//DataGasDataGas

