package com.example.convidados.repository

import android.content.ContentValues
import android.content.Context
import com.example.convidados.model.GuestModel

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

    fun insert(guest: GuestModel): Boolean {
        return try {
            val db = guestDataBase.writableDatabase

            val values = ContentValues()

            val isGuestPresence = if (guest.isPresent) 1 else 0
            values.put("name", guest.name)
            values.put("presence", isGuestPresence)

            db.insert("Guest", null, values)
            true
        } catch (e: Exception) {
            false
        }
    }
}