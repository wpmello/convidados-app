package com.example.convidados.repository

import android.content.Context

class GuestFormRepository(context: Context) {

    private val guestDataBase = GuestDataBase(context)

    //Singleton
    companion object {
        private lateinit var repository: GuestFormRepository

        fun getInstance(context: Context): GuestFormRepository {
            if (!::repository.isInitialized) {
                repository = GuestFormRepository(context)
            }
            return repository
        }
    }

    fun insert() {

    }
}