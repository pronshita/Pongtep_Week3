package com.example.week3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.acitivity_second.*

class SecondAcitivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acitivity_second)

        setTitle("second page jar")
        var fname = intent.extras?.getString(MainActivity().TAG_FNAME)
        var lname = intent.extras?.getString(MainActivity().TAG_LNAME)
        var nickname = intent.extras?.getString(MainActivity().TAG_NICKNAME)
        var phone = intent.extras?.getString(MainActivity().TAG_PHONE)
        var address = intent.extras?.getString(MainActivity().TAG_ADDRESS)

        tv_res_fname.setText(fname)
        tv_res_lname.setText(lname)
        tv_res_nickname.setText(nickname)
        tv_res_phone.setText(phone)
        tv_res_address.setText(address)

        btn_back.setOnClickListener {
            finish()
        }
    }

}