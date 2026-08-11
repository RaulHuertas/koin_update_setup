package com.rhuertas.kointest1

class UserApplication(
    private val userService: UserService
) {

    init {
        userService.loadUsers()
    }

    // display our data
    fun sayHello(name: String) {
        val user = userService.getUserOrNull(name)
        val message = userService.prepareHelloMessage(user)
        println(message)
    }
}
