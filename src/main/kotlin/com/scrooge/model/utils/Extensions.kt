package com.scrooge.model.utils

import java.text.DecimalFormat

fun Double.format(digitsAfterPoint: Int = 1): String {
	val b = StringBuilder("#0.")
	for (i in 0..digitsAfterPoint) {
		b.append("0")
	}
	return DecimalFormat(b.toString()).format(this)
}
