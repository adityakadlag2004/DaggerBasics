package com.android.daggerbasics.components

import com.android.daggerbasics.MainActivity
import com.android.daggerbasics.models.Car
import com.android.daggerbasics.modules.WheelsModule
import dagger.Component

@Component(modules = [WheelsModule::class])
interface CarComponent {

    fun getCar():Car

    fun inject(mainActivity: MainActivity)
}