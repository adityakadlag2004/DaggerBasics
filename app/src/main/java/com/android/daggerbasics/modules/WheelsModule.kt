package com.android.daggerbasics.modules

import com.android.daggerbasics.models.Rims
import com.android.daggerbasics.models.Tyres
import com.android.daggerbasics.models.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun provideRims():Rims{
    return Rims()
    }

    @Provides
    fun provideTyres():Tyres{
        return Tyres()
    }


    @Provides
    fun provideWheels(rims: Rims,tyres: Tyres):Wheels{
        return Wheels(rims,tyres)
    }


}