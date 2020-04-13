package com.michaelpippolito.k8s.helloworld.users

import com.michaelpippolito.k8s.helloworld.users.db.UsersEntity
import com.michaelpippolito.k8s.helloworld.users.db.UsersRepository
import org.springframework.stereotype.Service

@Service
class UsersService(private val usersRepository: UsersRepository) {
    fun getUserById(id: Int): UsersEntity =
        usersRepository.findById(id).get()
}