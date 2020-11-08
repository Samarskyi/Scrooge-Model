package com.scrooge.model.dto.statistic

import java.util.*

data class TotalByBase(val base: String, val deals: Int, val total: Double)
data class TotalByDateAndBase(val day: Date, val base: String, val deals: Int, val total: Double)
data class BalanceChangeInfo(val userId: String, val base: String,
                             val startDate: Date, val endDate: Date,
                             val firstValue: Double, val endValue: Double,
                             val diff: Double, val diffPercent: Double)
