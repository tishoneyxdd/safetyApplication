package com.example.safety

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listMembers= listOf<MemberModel>(
           MemberModel(
               "Shivam Badhopulu",
               "Tania Regency B/604 Opposite to Martin Complex New Link Road",
               "90%",
               "400"
           ),  MemberModel(
               "Sambhav Choudhary",
               "Cherry Apartment Nallaospara West, Funfeista Road",
               "5%",
               "900"
           ), MemberModel(
               "Dhruv Athaide",
               "Lower Parel Sewri Dosti Flamingo Near Some Bridge",
               "50%",
               "1"
           ),MemberModel(
               "John Doe",
               "Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow ",
               "90%",
               "660"
           ),




        )

        val adapter=MemberAdapter(listMembers)

        val recycler = requireView().findViewById<RecyclerView>(R.id.recycler_member)
        recycler.layoutManager= LinearLayoutManager(requireContext())
        recycler.adapter=adapter

    }

    companion object {

        @JvmStatic
        fun newInstance() = HomeFragment()

    }
}