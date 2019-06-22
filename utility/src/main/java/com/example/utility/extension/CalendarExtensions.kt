package com.example.utility.extension

import java.util.*

fun Calendar.getNameOfDay(): String {
    return when (this.get(Calendar.DAY_OF_WEEK)) {
        1 -> "Domingo"
        2 -> "Segunda"
        3 -> "Terça"
        4 -> "Quarta"
        5 -> "Quinta"
        6 -> "Sexta"
        else -> "Sábado"
    }
}