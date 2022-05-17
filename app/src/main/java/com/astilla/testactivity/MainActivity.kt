package com.astilla.testactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.astilla.customtoast.CustomToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CustomToast(this).toastMessage("HolaMundo")
    }
}