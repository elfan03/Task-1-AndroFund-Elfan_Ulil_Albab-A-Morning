package com.example.tugas1_elfaulilalbab_morninga

import android.content.Intent
import android.content.Intent.ACTION_SEND
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.tugas1_elfaulilalbab_morninga.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var tv:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv=findViewById(R.id.tvhome)

        val username=intent.getParcelableExtra<Userr>("User")?.username
        val password=intent.getParcelableExtra<Userr>("User")?.password
        tv.text ="Username :$username dan password : $password"


        val btnimplicit : Button = findViewById(R.id.btn_implitic)
        btnimplicit.setOnClickListener(this)

        val btnfragment : Button = findViewById(R.id.btn_fragment)
        btnfragment.setOnClickListener (this)
    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.btn_implitic ->{
/*                val message ="halo elfan"
                val intent = Intent()
                intent.action = ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT,message)
                intent.type="tex/plain"
                startActivity(intent)*/
                val intent= Intent()
                intent.putExtra("history","anda sudah login")
                setResult(RESULT_OK,intent)
                finish()
            }
            R.id.btn_fragment ->{
                val intent = Intent(this@MainActivity, untukfragment::class.java)
                startActivity(intent)
            }
        }
    }
}