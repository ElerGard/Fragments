package com.example.myapplication

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.fragments.fOne
import com.example.myapplication.fragments.fSec

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentOne = fOne()
        val fragmentSec = fSec()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment, fragmentOne)
            commit()
        }

        val BottomNavigationView = findViewById<BottomNavigationView>(R.id.nav_view)

        BottomNavigationView.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.dnd -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragment, fragmentOne)
                        commit()
                    }
                }
                R.id.recycler -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragment, fragmentSec)
                        commit()
                    }
                }

            }
            true
        }
    }


}