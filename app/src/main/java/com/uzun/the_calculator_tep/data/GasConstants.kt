package com.uzun.the_calculator_tep.data

enum class GasConstants (var v: Double){
    VC(0.0),
    VALUE(0.0),
    COEFF(1.0),
    TEMP_GAZ_STANDART(20.0),
    PESS_GAZ_STANDART(1.01325),
    COEFF_COMPRESS_GAZ(0.9873)
}
/*
VC = Vс - Приведенный объе газа, m3
V = Объем газа измеренный счетчик, m3
K = коэффициент для приведения к стандартным условия
 */