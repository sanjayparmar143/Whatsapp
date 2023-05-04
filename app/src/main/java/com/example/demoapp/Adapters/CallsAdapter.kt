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

class CallsAdapter(CallsList: ArrayList<ProModel>) : RecyclerView.Adapter<CallsAdapter.CallsHolder>(){

    var CallsList = CallsList
    lateinit var context: Context

    class CallsHolder(itemView: View) : ViewHolder(itemView){
        var imgProfile = itemView.findViewById<CircleImageView>(R.id.imgProfile)
        var txtName = itemView.findViewById<TextView>(R.id.txtName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallsHolder {
        context = parent.context
        var view = LayoutInflater.from(parent.context).inflate(R.layout.calls_item,parent,false)
        return CallsHolder(view)
    }

    override fun getItemCount(): Int {
        return CallsList.size
    }

    override fun onBindViewHolder(holder: CallsHolder, position: Int) {

        holder.txtName.text = CallsList.get(position).name
        Glide.with(context).load(CallsList.get(position).Profiles).into(holder.imgProfile)

    }
}