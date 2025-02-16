package com.personal.portfolio

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform