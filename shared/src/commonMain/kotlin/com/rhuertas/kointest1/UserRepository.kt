package com.rhuertas.kointest1

interface UserRepository {
    fun findUserOrNull(name: String): User?
    fun addUsers(users: List<User>)
}