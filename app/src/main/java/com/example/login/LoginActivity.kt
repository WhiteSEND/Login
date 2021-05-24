package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    val adminId = "admin"
    val adminPw = "1234admin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginbtn.setOnClickListener {
            val id = idEdt.text.toString()
            val pw = pwEdt.text

            if( id.equals("") || pw.equals("") ) {
                    Toast.makeText(this, "id 또는 PW 공백", Toast.LENGTH_SHORT).show()
            }else {

                // DB 접속하여 id와 pw가 맞는지 확인 필요
                //맞으면 return 값을 ok로, 틀리면 return 값을 no로

                if( id.equals(adminId) && pw.equals(adminPw) ) {
                    val intent = Intent(this@LoginActivity, MainActivity::class.java)
                    startActivity(intent)
                }else{
                    Toast.makeText(this, "id 또는 PW 오류", Toast.LENGTH_SHORT).show()
                }
            }
        }


        joinbtn.setOnClickListener{
            val intent = Intent(this@LoginActivity, JoinActivity::class.java)
            startActivity(intent)
        }
    }
}