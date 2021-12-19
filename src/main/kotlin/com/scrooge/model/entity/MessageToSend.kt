package com.scrooge.model.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "messages_to_send")
data class MessageToSend(@Id val id: ObjectId, val userId: ObjectId, val message: String)