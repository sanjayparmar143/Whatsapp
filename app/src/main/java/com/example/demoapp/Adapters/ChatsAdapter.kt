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

class ChatsAdapter(Chatlist: ArrayList<ProModel>) : RecyclerView.Adapter<ChatsAdapter.ChatsHolder>(){

    var Chatlist = Chatlist
    lateinit var context: Context

    class ChatsHolder(itemView: View) : ViewHolder(itemView){
        var imgProfile = itemView.findViewById<CircleImageView>(R.id.imgProfile)
        var txtName = itemView.findViewById<TextView>(R.id.txtName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatsHolder {
        context = parent.context
        var view = LayoutInflater.from(parent.context).inflate(R.layout.chats_item,parent,false)
        return ChatsHolder(view)
    }

    override fun getItemCount(): Int {

        return Chatlist.size
    }

    override fun onBindViewHolder(holder: ChatsHolder, position: Int) {

        holder.txtName.text = Chatlist.get(position).name
        Glide.with(context).load(Chatlist.get(position).Profiles).into(holder.imgProfile)
    }
}