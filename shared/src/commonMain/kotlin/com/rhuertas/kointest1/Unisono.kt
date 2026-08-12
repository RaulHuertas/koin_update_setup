package com.rhuertas.kointest1

import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.core.annotation.Single

interface Unisono {
    fun sayHello(name: String): String
}
@Single(createdAtStart = true)
class UnisonoImpl : Unisono {
    override fun sayHello(name: String): String {
        return "Hello, $name!"
    }
}
@Module
@ComponentScan(
    "com.rhuertas.kointest1",
)
class UnisonoModule
