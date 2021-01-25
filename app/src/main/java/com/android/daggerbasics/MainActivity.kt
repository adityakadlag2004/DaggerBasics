package com.android.daggerbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.daggerbasics.components.CarComponent
import com.android.daggerbasics.components.DaggerCarComponent
import com.android.daggerbasics.models.Car
import dagger.internal.DaggerCollections

class MainActivity : AppCompatActivity() {
    private lateinit var car:Car
    private lateinit var component:DaggerCarComponent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        component= DaggerCarComponent.create() as DaggerCarComponent

        car=component.getCar()
    }
}