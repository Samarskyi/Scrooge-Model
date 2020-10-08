package com.scrooge.model.dto

import com.scrooge.model.user.User

data class LoginResponse(val jwt: JwtToken, val user: User)