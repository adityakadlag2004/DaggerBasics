package com.android.daggerbasics.models

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

class PetrolEngine
@Inject constructor() : Engine {
    override fun start() {
        Log.d(TAG, "drive:PetrolEngine Started ")
    }
}