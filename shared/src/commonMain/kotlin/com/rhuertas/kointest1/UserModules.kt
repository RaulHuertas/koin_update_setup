package com.rhuertas.kointest1

import org.koin.dsl.module

val userModule = module {
    single<UserRepository> { UserRepositoryImp() }
    single<UserService> { UserServiceImpl(get()) }
    single { UserApplication(get()) }
}