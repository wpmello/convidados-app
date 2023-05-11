package com.example.convidados.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.convidados.model.GuestModel
import com.example.convidados.repository.GuestFormRepository

class GuestFormViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = GuestFormRepository.getInstance(application)

    private var guestModel = MutableLiveData<GuestModel>()
    val guest: LiveData<GuestModel> = guestModel

    fun insert(guest: GuestModel) {
        repository.insert(guest)
    }

    fun getGuest(id: Int) {

        repository.get(id)
    }
}