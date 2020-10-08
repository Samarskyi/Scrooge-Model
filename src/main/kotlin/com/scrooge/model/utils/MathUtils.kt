package com.scrooge.model.utils

import java.math.BigDecimal
import java.math.RoundingMode
import java.time.LocalDateTime
import java.time.ZoneId

fun getDifferentInPercent(a: Double, b: Double): Double {
	return ((b / a) - 1) * 100
}

fun Double.getDiffInPercent(b: Double): Double {
	return ((b / this) - 1) * 100
}

fun average(first: Double, second: Double): Double {
	return (first + second) / 2
}

fun maxPossibleAmount(value: Double, price: Double): BigDecimal {
	return BigDecimal(value / price)
}

fun moreThanMinQty(amount: Double, min: Double): Boolean {
	return amount > min
}

fun getStringFromDouble(d: Double): String {
	return BigDecimal(d).setScale(10, RoundingMode.CEILING).toString()
}

fun toMilliseconds(t: LocalDateTime): Long {
	return t.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()
}
