package com.uzun.the_calculator_tep.data

data class DataGas(var temp: Double, var press: Double){
    private var valueCoeff = 0.0
    private var value = 0.0
    private var coeff = 1.0
    private var tempGasStandart = 20.0
    private var pressGasStandart = 1.01325
    private var coeffCompressGas = 0.9873

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
            coeff = (1 / coeffCompressGas) * (press / pressGasStandart)  * (temp / tempGasStandart)
        }
    }

                        /* Сеторы */

    fun setValueCoeff(v:Double){valueCoeff = v}
    fun setValue(v:Double){value = v}
    fun setCoeff(v:Double){coeff = v}
    fun setTempGasStandart(v:Double){tempGasStandart = v}
    fun setPressGasStandart(v:Double){pressGasStandart = v}
    fun setCoeffCompressGas(v:Double){coeffCompressGas = v}

    fun getValueCoeff():Double{return valueCoeff}

}//DataGasDataGas

