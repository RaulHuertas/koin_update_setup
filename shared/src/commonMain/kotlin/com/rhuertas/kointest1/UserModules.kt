package com.rhuertas.kointest1

import org.koin.dsl.bind
import org.koin.dsl.module
import org.koin.plugin.module.dsl.single

val userModule = module {
    single<UserRepository> { UserRepositoryImp() }
    single<UserServiceImpl>() bind UserService::class
}