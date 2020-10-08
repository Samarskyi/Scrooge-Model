package com.scrooge.model

import com.scrooge.model.enums.TransactionStatus
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "user_transactions")
data class UserTransaction(
		@Id val id: ObjectId = ObjectId(),
		val userId: ObjectId,
		val start: Date,
		var end: Date,
		var deals: Set<ObjectId>,
		var totalProfit: Double,
		var totalFee: Double,
		var status: TransactionStatus,
		var transactionId: ObjectId? = null
)
