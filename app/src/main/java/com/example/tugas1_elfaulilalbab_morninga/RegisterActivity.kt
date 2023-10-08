package com.example.tugas1_elfaulilalbab_morninga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtusername:EditText
    private lateinit var edtnomortelepon: EditText
    private lateinit var edtemail :EditText
    private lateinit var edtpassword : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        edtusername = findViewById(R.id.edt_namaRegister)
        edtnomortelepon = findViewById(R.id.edt_noRegister)
        edtpassword = findViewById(R.id.edt_passworRegister)

        val btnregistrasi : Button = findViewById(R.id.btn_Register)
        btnregistrasi.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_Register ->{
                val bundle =Bundle()
                bundle.putString("username",edtusername.text.toString())
                bundle.putString("password",edtpassword.text.toString())
                val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
            R.id.btn_fragment ->{
                val intent = Intent(this@RegisterActivity, untukfragment::class.java)
                startActivity(intent)
            }
        }

    }
}