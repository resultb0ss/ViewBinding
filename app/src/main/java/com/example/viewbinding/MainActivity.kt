package com.example.viewbinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.viewbinding.databinding.ActivityMainBinding
import com.example.viewbinding.fragments.MainFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null){
            val mainFragment = MainFragment()
            supportFragmentManager.beginTransaction()
                .add(R.id.containerID, mainFragment)
                .commit()
        }

    }
}
