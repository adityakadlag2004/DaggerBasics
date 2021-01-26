package com.android.daggerbasics.models

import android.util.Log
import javax.inject.Inject


public class Car
@Inject
constructor(var engine: Engine, wheels: Wheels) {


    val TAG = "Car"
    fun drive() {
        Log.d(TAG, "drive: Driving")
        engine.start()
    }

}