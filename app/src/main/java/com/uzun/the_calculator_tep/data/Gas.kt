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

    fun calculationCoefficient():Double {
        // проверка деления на  ноль
        var valueP: Double = 1.0
        if (temp == 0.0 || press == 0.0) {
            temp = 0.1
            press = 0.1

        } else {
             valueP = ((1 / coeffCompressGas) * (press / pressGasStandart)  * (temp / tempGasStandart)) * coeff
        }
        return valueP
    }

                        /* Сеторы */

    //fun setValueCoeff(v:Double){valueCoeff = v}
    fun setTemp(v:Double){temp = v}
    fun setPress(v:Double){press = v}
    fun setValue(v:Double){value = v}
    fun setCoeff(v:Double){coeff = v}
    fun setPressGasStandart(v:Double){pressGasStandart = v}
    fun setCoeffCompressGas(v:Double){coeffCompressGas = v}

    fun getTemp():Double {return temp}
    fun getPress():Double {return press}
}//DataGasDataGas

