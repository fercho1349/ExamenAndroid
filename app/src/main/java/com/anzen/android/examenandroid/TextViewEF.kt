package com.anzen.android.examenandroid

import android.widget.TextView

fun TextView.setText(text: String?, fallback: String) {
    this.text = if (text.isNullOrEmpty()) fallback else text
}