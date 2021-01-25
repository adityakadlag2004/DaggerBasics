package com.android.daggerbasics.components

import com.android.daggerbasics.MainActivity
import com.android.daggerbasics.models.Car
import dagger.Component

@Component
public interface CarComponent {

    fun getCar():Car

    fun inject(mainActivity: MainActivity) :Unit
}