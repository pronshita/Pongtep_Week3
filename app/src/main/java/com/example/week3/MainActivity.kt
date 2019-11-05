package com.example.week3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    public final var TAG_FNAME = "FNAME"
    public final var TAG_LNAME = "LNAME"
    public final var TAG_NICKNAME = "NICKNAME"
    public final var TAG_PHONE = "PHONE"
    public final var TAG_ADDRESS = "ADDRESS"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("!!main naja!!")
        btn_sender.setOnClickListener {
            var fname = et_fname.text.toString()
            var lname = et_lname.text.toString()
            var nickname = et_nickname.text.toString()
            var phone = et_phone.text.toString()
            var address = et_address.text.toString()

            senderFun(fname,lname,nickname,phone,address)
        }

        btn_clear.setOnClickListener {
            et_fname.setText("")
            et_lname.setText("")
            et_nickname.setText("")
            et_phone.setText("")
            et_address.setText("")
        }

        btn_close_app.setOnClickListener {
            finish()
        }

    }

    fun senderFun(str1 : String,str2 : String,str3 : String,str4 :String,str5 :String){
        var goPagesecond = Intent( this,SecondAcitivity ::class.java)

        goPagesecond.putExtra(TAG_FNAME,str1)
        goPagesecond.putExtra(TAG_LNAME,str2)
        goPagesecond.putExtra(TAG_NICKNAME,str3)
        goPagesecond.putExtra(TAG_PHONE,str4)
        goPagesecond.putExtra(TAG_ADDRESS,str5)
        startActivity(goPagesecond)
    }
}
