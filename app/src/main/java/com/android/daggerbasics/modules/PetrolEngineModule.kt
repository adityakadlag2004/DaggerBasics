package com.android.daggerbasics.modules

import com.android.daggerbasics.models.Engine
import com.android.daggerbasics.models.PetrolEngine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract fun bindEngine(petrolEngine:PetrolEngine):Engine

}