package com.scrooge.model

import com.scrooge.model.enums.TransactionType
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "transactions")
class Transaction(
		@Id val id: ObjectId,
		val userId: ObjectId,
		val amount: Double,
		val date: Date,
		val userWallet: String,
		val scroogeWallet: String,
		val transactionType: TransactionType
)
