package com.example.tugas1_elfaulilalbab_morninga
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Userr (
    val username:String,
    val password:String
): Parcelable
