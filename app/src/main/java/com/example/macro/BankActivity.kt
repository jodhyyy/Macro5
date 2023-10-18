package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.macro.databinding.ActivityBankBinding
import com.example.macro.databinding.ActivityTukarPointBerhasilBinding

class BankActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBankBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBankBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ibHome.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }
    }
}