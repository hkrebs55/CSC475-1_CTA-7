package com.example.csc475_1_cta_7

class TextUtil {
    companion object {
        fun isStringDouble(str: String): Boolean {
            return try {
                str.toDoubleOrNull() != null
            } catch (e: NumberFormatException) {
                false
            }
        }
    }
}