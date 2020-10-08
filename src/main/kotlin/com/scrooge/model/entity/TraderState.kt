package com.scrooge.model.entity

import com.scrooge.model.dto.TraderStateDTO
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "trader_state")
data class TraderState(@Id var id: ObjectId = ObjectId(), var userId: String) : TraderStateDTO()
