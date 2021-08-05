package com.uzun.the_calculator_tep.data

class Gas(
    private var temp: Double = 1.0,
    private var press: Double = 1.0,
    private var value: Double = 2.0,
    private var coeff: Double = 1.0,
    private var tempGasStandart: Double = 20.0,
    private var pressGasStandart: Double =  1.01325,
    private var coeffCompressGas: Double = 0.9873
){

    fun calculationValue():Double{
        calculationCoefficient()
       return  value * coeff
    }

    private fun calculationCoefficient() {
        // проверка деления на  ноль
        if (temp == 0.0 || press == 0.0) {
            temp = 0.1
            press = 0.1
        } else {
            setValue((1 / coeffCompressGas) * (press / pressGasStandart)  * (temp / tempGasStandart))
        }
    }

                        /* Сеторы */

    //fun setValueCoeff(v:Double){valueCoeff = v}
    fun setValue(v:Double){value = v}
    fun setCoeff(v:Double){coeff = v}
    //fun setTempGasStandart(v:Double){tempGasStandart = v}
    fun setPressGasStandart(v:Double){pressGasStandart = v}
    fun setCoeffCompressGas(v:Double){coeffCompressGas = v}

}//DataGasDataGas

