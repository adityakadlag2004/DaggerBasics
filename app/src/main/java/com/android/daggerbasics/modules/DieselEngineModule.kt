package com.android.daggerbasics.modules

import com.android.daggerbasics.models.DieselEngine
import com.android.daggerbasics.models.Engine
import com.android.daggerbasics.models.PetrolEngine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract fun bindEngine(petrolEngine:DieselEngine):Engine

}