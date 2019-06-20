package com.example.utility.extension

import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun AppCompatActivity.callFragment(@IdRes layoutContainer: Int, fragment: Fragment) {
    val transaction = this.supportFragmentManager.beginTransaction()
    transaction.replace(layoutContainer, fragment)
    transaction.commit()
}