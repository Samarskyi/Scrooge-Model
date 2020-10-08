package com.scrooge.model

import com.scrooge.model.enums.TransactionStatus
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "referral_transactions")
data class ReferralTransaction(
		@Id val id: ObjectId = ObjectId(),
		val referrerId: ObjectId,
		var fee: Double,
		var status: TransactionStatus,
		var transactionId: ObjectId? = null
)
