package com.example.viewbinding

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.SurfaceControl.Transaction
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.fragment.app.FragmentTransaction
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
                val fragment = widgets[position].fragment
//
//                val transaction = this.fragmentManager?.beginTransaction()
//                transaction?.replace(R.id.containerID,fragment)
//                transaction?.addToBackStack(null)
//                transaction?.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
//                transaction?.commit()
                Log.d("@@@","Выбран элемент ${widgets[position].name}")

            }

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}