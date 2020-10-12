package com.example.lab9mysqlupdatedelete

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class EditStudentsAdapter(val item: List<Student>, val context: Context): RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view_item = LayoutInflater.from(parent.context)
            .inflate(R.layout.edit_delete_item_layout, parent, false)
        val myHolder = ViewHolder(view_item)
        view_item.setOnClickListener() {
            val pos = myHolder.adapterPosition
            val context = parent.context
            val student = item[pos]
            val intent = Intent(context, EditDeleteActivity::class.java)
            intent.putExtra("mId", student.std_id)
            intent.putExtra("mName", student.std_name)
            intent.putExtra("mAge", student.std_age.toString())
            context.startActivity(intent)
        }
        return myHolder
    }

    override fun getItemCount(): Int {
        return item.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvID.text = item[position].std_id
        holder.tvName.text = item[position].std_name
    }
}