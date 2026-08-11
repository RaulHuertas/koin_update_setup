package com.rhuertas.kointest1

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform