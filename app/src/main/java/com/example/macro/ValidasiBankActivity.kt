package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.macro.databinding.ActivityValidasiBankBinding

class ValidasiBankActivity : AppCompatActivity() {

    private lateinit var binding: ActivityValidasiBankBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityValidasiBankBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBankTarik.setOnClickListener {
            startActivity(Intent(this, TukarPointBerhasilActivity::class.java))
        }
        binding.ibHome.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }
        binding.ibBackArrow.setOnClickListener {
            startActivity(Intent(this, BankActivity::class.java))
        }
    }
}