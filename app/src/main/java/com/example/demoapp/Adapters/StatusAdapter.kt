package com.example.demoapp.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.demoapp.ProModel
import com.example.demoapp.R
import de.hdodenhof.circleimageview.CircleImageView

class StatusAdapter(StatusList: ArrayList<ProModel>) : RecyclerView.Adapter<StatusAdapter.StatusHolder>() {

    var StatusList = StatusList
    lateinit var context: Context
    class StatusHolder(itemView: View) : ViewHolder(itemView) {

        var imgProfile = itemView.findViewById<CircleImageView>(R.id.imgProfile)
        var txtName = itemView.findViewById<TextView>(R.id.txtName)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatusHolder {
        context = parent.context
        var view = LayoutInflater.from(parent.context).inflate(R.layout.status_item,parent,false)
        return StatusHolder(view)
    }

    override fun getItemCount(): Int {

        return StatusList.size
    }

    override fun onBindViewHolder(holder: StatusHolder, position: Int) {

        holder.txtName.text = StatusList.get(position).name
        Glide.with(context).load(StatusList.get(position).Profiles).into(holder.imgProfile)
    }
}