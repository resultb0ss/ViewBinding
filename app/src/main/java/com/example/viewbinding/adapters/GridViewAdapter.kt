package com.example.viewbinding.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.viewbinding.databinding.GridViewItemBinding
import com.example.viewbinding.models.Widget
import kotlinx.coroutines.NonDisposableHandle.parent

class GridViewAdapter (
    private val list: MutableList<Widget>,
    private val context: Context
): BaseAdapter() {

    private var layoutInflater: LayoutInflater? = null
    private var _binding: GridViewItemBinding? = null
    private val binding get() = _binding!!

    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(p0: Int): Any? {
        return null
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        if (layoutInflater == null){
            layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        }

        if(p1 == null){
            _binding = GridViewItemBinding.inflate(layoutInflater!!, p2, false)
        } else {
            _binding = GridViewItemBinding.bind(p1)
        }

        binding.iteGridViewImageView.setImageResource(list[p0].image)
        binding.itemGridViewTextViewTV.text = list[p0].name


        return binding.root
    }
}