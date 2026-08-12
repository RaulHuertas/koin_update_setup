package com.rhuertas.kointest1

import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module

//val userModule = module {
//    single<UserRepository> { UserRepositoryImp() }
//    single<UserService> { UserServiceImpl(get()) }
//    single { UserApplication(get()) }
//}

@Module
@ComponentScan("com.rhuertas.kointest1")
class AppModule
