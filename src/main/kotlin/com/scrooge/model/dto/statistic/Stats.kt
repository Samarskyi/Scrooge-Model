package com.scrooge.model.dto.statistic

import java.util.*

data class TotalByBase(val base: String, val deals: Int, val total: Double)
data class DetailsByDateAndBase(val day: Date, val base: String, val deals: Int, val total: Double)
data class BalanceChangeInfo(val userId: String, val base: String,
                             val startDate: Date, val endDate: Date,
                             val firstValue: Double, val endValue: Double,
                             val diff: Double, val diffPercent: Double)


data class StatisticResponse(
		val today: TotalByBase, val todayDetails: List<DetailsByDateAndBase>,
		val weekly: TotalByBase, val weeklyDetails: List<DetailsByDateAndBase>,
		val monthly: TotalByBase, val monthlyDetails: List<DetailsByDateAndBase>,
		val total: TotalByBase
)
