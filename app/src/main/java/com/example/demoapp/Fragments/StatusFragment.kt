package com.example.demoapp.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.demoapp.Adapters.StatusAdapter
import com.example.demoapp.ProModel
import com.example.demoapp.R
import com.example.demoapp.databinding.FragmentChatsBinding
import com.example.demoapp.databinding.FragmentStatusBinding


class StatusFragment : Fragment() {

    var profile = arrayOf(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4,
        R.drawable.image5,
        R.drawable.image6,
        R.drawable.image7,
        R.drawable.image8,
        R.drawable.image9,
        R.drawable.image10,
        R.drawable.image11,
        R.drawable.image12,
        R.drawable.image13,
        R.drawable.image14,
        R.drawable.image15,
        R.drawable.image16,
        R.drawable.image17,
        R.drawable.image18,
        R.drawable.image19,
        R.drawable.image20,
        R.drawable.image21
    )
    var names = arrayOf("Sanjay","Rahul","Ravi","Harsh","kevin","Vishal","Sahdev","Aarav","Mahesh","Shubham","Vivek","Vihaan","Vikram","Aakash","Nitin","Paresh","Mohit","Darshan","Dev","Piyush","Sandip")
    lateinit var binding: FragmentStatusBinding
    var Statuslist = ArrayList<ProModel>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStatusBinding.inflate(layoutInflater)

        for (i in 0..profile.size-1 ){

            var model = ProModel(profile[i],names[i])
            Statuslist.add(model)
        }

        binding.rcvStatus.layoutManager = LinearLayoutManager(context)
        binding.rcvStatus.adapter = StatusAdapter(Statuslist)

        return binding.root
    }

}
