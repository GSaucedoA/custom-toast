package com.astilla.customtoast

import android.content.Context
import android.widget.Toast

data class CustomToast(private val context: Context) {
    fun toastMessage(message: String) {
        Toast.makeText(this.context, message, Toast.LENGTH_LONG).show()
    }
}
