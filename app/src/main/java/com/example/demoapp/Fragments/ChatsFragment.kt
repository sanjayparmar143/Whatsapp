package com.example.demoapp.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.demoapp.Adapters.ChatsAdapter
import com.example.demoapp.ProModel
import com.example.demoapp.R.drawable.*
import com.example.demoapp.databinding.FragmentChatsBinding


class ChatsFragment : Fragment() {



    var profile = arrayOf(image1,image2,image3,image4,image5,image6,image7,image8,image9,image10,image11,image12,image13,image14,image15,image16,image17,image18,image19,image20,image21)
    var names = arrayOf("Sanjay","Rahul","Ravi","Harsh","kevin","Vishal","Sahdev","Aarav","Mahesh","Shubham","Vivek","Vihaan","Vikram","Aakash","Nitin","Paresh","Mohit","Darshan","Dev","Piyush","Sandip")
    lateinit var binding: FragmentChatsBinding
    var Chatlist = ArrayList<ProModel>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentChatsBinding.inflate(layoutInflater)

        for (i in 0..profile.size - 1) {

            var model = ProModel(profile[i], names[i])
            Chatlist.add(model)
        }

        binding.rcvChats.layoutManager = LinearLayoutManager(context)
        binding.rcvChats.adapter = ChatsAdapter(Chatlist)

        return binding.root
    }

}