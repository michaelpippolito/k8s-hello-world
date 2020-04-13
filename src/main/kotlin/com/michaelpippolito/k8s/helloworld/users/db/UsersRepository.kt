package com.michaelpippolito.k8s.helloworld.users.db

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
@Transactional
interface UsersRepository: JpaRepository<UsersEntity, Int>