package com.android.daggerbasics.modules

import com.android.daggerbasics.models.DieselEngine
import com.android.daggerbasics.models.Engine
import dagger.Module
import dagger.Provides

@Module
 class DieselEngineModule constructor(var horsePower: Int) {


    @Provides
    fun provideEngine(): Engine {
        return DieselEngine(horsePower)
    }
}