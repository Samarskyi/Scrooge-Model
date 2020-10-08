package com.scrooge.model.dto

data class ChangePasswordDTO(val oldPassword: String, val password: String, val confirmPassword: String)