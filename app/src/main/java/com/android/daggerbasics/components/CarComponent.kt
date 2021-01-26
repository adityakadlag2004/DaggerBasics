package com.android.daggerbasics.components

import com.android.daggerbasics.MainActivity
import com.android.daggerbasics.models.Car
import com.android.daggerbasics.modules.DieselEngineModule
import com.android.daggerbasics.modules.PetrolEngineModule
import com.android.daggerbasics.modules.WheelsModule
import dagger.Component

@Component(modules = [WheelsModule::class,DieselEngineModule::class])
interface CarComponent {

    fun getCar():Car

    fun inject(mainActivity: MainActivity)
}