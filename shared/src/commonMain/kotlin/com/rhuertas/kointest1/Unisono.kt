package com.rhuertas.kointest1

import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.core.annotation.Single
import org.koin.dsl.module
import org.koin.plugin.module.dsl.single

interface Unisono {
    fun sayHello(name: String): String
}
@Single(createdAtStart = true)
//@ComponentScan
class UnisonoImpl : Unisono {
    override fun sayHello(name: String): String {
        return "Hello, $name!"
    }
}
//@Module
//@ComponentScan("com.rhuertas.kointest1")
//class UnisonoModule
//import org.koin.dsl.module

// Shared definitions (Compiler Plugin DSL)
val unisonoModule = module {
    single<UnisonoImpl>()
}
