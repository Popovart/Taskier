package com.example.taskier2

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform