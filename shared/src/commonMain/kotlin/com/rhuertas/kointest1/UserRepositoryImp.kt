package com.rhuertas.kointest1

import org.koin.dsl.module

class UserRepositoryImp : UserRepository {
    private val _users = arrayListOf<User>()

    override fun findUserOrNull(name: String): User? {
        return _users.firstOrNull { it.name == name }
    }

    override fun addUsers(users: List<User>) {
        _users.addAll(users)
    }
}

