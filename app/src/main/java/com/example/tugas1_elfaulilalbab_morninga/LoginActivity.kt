package com.example.tugas1_elfaulilalbab_morninga

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var edtusername: EditText
    private lateinit var edtpassword : EditText
    private lateinit var history:TextView

    val resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        result ->
        if (result.resultCode == Activity.RESULT_OK){
            val data:Intent? = result.data
            val returnString:String? = data?.getStringExtra("history")
            history.text = returnString

        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        history = findViewById(R.id.tvhistory)
        edtusername =findViewById(R.id.edt_emaillogin)
        edtpassword =findViewById(R.id.edt_passwordlogin)

        val bundle =intent.extras
        if (bundle !=null){
            edtusername.setText(bundle.getString("username"))
            edtpassword.setText(bundle.getString("password"))
        }


        val btnmasuk : Button = findViewById(R.id.btn_login)
        btnmasuk.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_login ->{
                val intent = Intent(this@LoginActivity,MainActivity::class.java)
                intent.putExtra("User", Userr (edtusername.text.toString(),edtpassword.text.toString()))
                resultLauncher.launch(intent)

            }
        }
    }
}

private fun Intent.putExtra(s: String, toString: String, toString1: String) {

}
