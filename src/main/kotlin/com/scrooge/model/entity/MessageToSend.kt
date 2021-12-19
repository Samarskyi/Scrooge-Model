package com.scrooge.model.entity

import org.bson.types.ObjectId
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "messages_to_send")
data class MessageToSend(val userId: ObjectId, val message: String)