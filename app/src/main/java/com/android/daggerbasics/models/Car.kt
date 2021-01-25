package com.android.daggerbasics.models

import android.util.Log
import javax.inject.Inject


class Car
@Inject
constructor(var engine: Engine, wheels: Wheels) {

    private val TAG = "Car"
    fun drive() {
        Log.d(TAG, "drive: Driving")
    }

}