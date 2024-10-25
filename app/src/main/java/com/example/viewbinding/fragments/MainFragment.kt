package com.example.viewbinding.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.fragment.app.FragmentTransaction
import com.example.viewbinding.R
import com.example.viewbinding.adapters.GridViewAdapter
import com.example.viewbinding.databases.WidgetsDataBase
import com.example.viewbinding.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    private val widgets = WidgetsDataBase.widgets

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentMainBinding.inflate(inflater,container,false)

        val adapter = GridViewAdapter(widgets, requireContext())
        binding.mainFragmentGridView.adapter = adapter


        binding.mainFragmentGridView.onItemClickListener = AdapterView.OnItemClickListener{_,_,position,_ ->

            if (widgets[position].name != "Logout"){
                val fragment = widgets[position].fragment
                val transaction = this.fragmentManager?.beginTransaction()
                if (fragment != null) {
                    transaction?.replace(R.id.containerID,fragment)
                }
                transaction?.addToBackStack(null)
                transaction?.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                transaction?.commit()
            } else {
                requireActivity().finishAffinity()
            }

            }

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}