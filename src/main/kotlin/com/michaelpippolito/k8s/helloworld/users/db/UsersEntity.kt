package com.michaelpippolito.k8s.helloworld.users.db

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "users")
data class UsersEntity(
    @Id
    @Column(name = "id", nullable = false)
    val id: Int,

    @Column(name = "first_name", nullable = false)
    val firstName: String,

    @Column(name = "last_name", nullable = false)
    val lastName: String
)