package com.example.convidados.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.convidados.model.GuestModel
import com.example.convidados.repository.GuestFormRepository

class GuestFormViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = GuestFormRepository.getInstance(application)

    fun insert(guest: GuestModel) {
        repository.insert(guest)
    }
}