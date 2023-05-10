package com.example.convidados.repository

class GuestFormRepository {

    //Singleton
    companion object {
        private lateinit var repository: GuestFormRepository

        fun getInstance(): GuestFormRepository {
            if (!::repository.isInitialized) {
                repository = GuestFormRepository()
            }
            return repository
        }
    }

    fun save() {

    }
}