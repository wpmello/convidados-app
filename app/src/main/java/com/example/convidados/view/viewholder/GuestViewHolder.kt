package com.example.convidados.view.viewholder

import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import com.example.convidados.R
import com.example.convidados.databinding.RowGuestBinding
import com.example.convidados.model.GuestModel
import com.example.convidados.view.listener.OnGuestListener

class GuestViewHolder(private val bind: RowGuestBinding, private val listener: OnGuestListener) :
    RecyclerView.ViewHolder(bind.root) {

    fun bind(guest: GuestModel) {
        bind.textName.text = guest.name

        bind.textName.setOnClickListener {
            listener.onClick(guest.id)
        }

        bind.textName.setOnLongClickListener {
            AlertDialog.Builder(itemView.context)
                .setTitle(R.string.delete_guest_title)
                .setMessage(R.string.delete_guest_message)
                .setPositiveButton(R.string.yes) { dialog, wich ->
                    listener.onDelete(guest.id)
                }
                .setNegativeButton(R.string.no, null)
                .create()
                .show()
            true
        }
    }
}