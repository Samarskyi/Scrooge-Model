package com.scrooge.model.entity

import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "balances")
data class Balance(val userId: String, val base: String, val balance: Double, val date: Date)
