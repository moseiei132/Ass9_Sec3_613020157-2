package com.example.lab9mysqlupdatedelete
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.edit_delete_item_layout.view.*


class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
    val tvID = view.tvID
    val tvName = view.tvName
}