package com.uzun.the_calculator_tep.data

data class DataGas(var temp: Int, var press: Int){
    private var valueCoeff = 1
    private var value = 2 // Измереный расход
    private var coeff = 1
    private var tempGasStandart = 20
    private var pressGasStandart = 32// 1.01325
    private var coeffCompressGas = 1//0.9873
    private  val IvalueCoeff = 12
    fun calculationValue(){
        calculationCoefficient()
        valueCoeff = value * coeff
    }

    private fun calculationCoefficient(){

        // проверка деления на  ноль
        if (temp == 0 || press == 0) {
            temp = 1//0.1
            press =1 // 0.1
        } else {
            coeff = (1 / coeffCompressGas) * (press / pressGasStandart)  * (temp / tempGasStandart)
        }
    }

                        /* Сеторы */

    //fun setValueCoeff(v:Double){valueCoeff = v}
    fun setValue(v:Int){value = v}
    fun setCoeff(v:Int){coeff = v}
//    fun setTempGasStandart(v:Double){tempGasStandart = v}
//    fun setPressGasStandart(v:Double){pressGasStandart = v}
//    fun setCoeffCompressGas(v:Double){coeffCompressGas = v}

    fun getValueCoeff():Int{return valueCoeff}
    fun getIntValueCoeff():Int{return IvalueCoeff}
    //fun getValueCoeff():Double{return valueCoeff}

}//DataGasDataGas

