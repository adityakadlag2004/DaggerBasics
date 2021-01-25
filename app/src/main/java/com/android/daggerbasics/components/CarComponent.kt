package com.android.daggerbasics.components

import com.android.daggerbasics.models.Car
import dagger.Component

@Component
interface CarComponent {

    fun getCar():Car
}