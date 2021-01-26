package com.android.daggerbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import com.android.daggerbasics.components.DaggerCarComponent
import com.android.daggerbasics.models.Car
import com.android.daggerbasics.modules.DieselEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    var car: Car? = null

    lateinit var component: DaggerCarComponent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        component = DaggerCarComponent.builder()
            .dieselEngineModule(DieselEngineModule(322))
            .build() as DaggerCarComponent
        component.inject(this)

        car = component.getCar()

        car!!.drive()
    }
}