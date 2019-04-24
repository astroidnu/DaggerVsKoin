package com.scoproject.daggervskoin.dagger

import com.scoproject.daggervskoin.*
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


/**
 * Created by ibnumuzzakkir on 2019-04-24.
 * Mobile Engineer
 */
@Module
class DaggerModule {
    @Provides
    fun provideModuleA() = ModuleA()

    @Provides
    fun provideModuleB() = ModuleB()

    @Provides
    fun provideModuleC(moduleA: ModuleA, moduleB: ModuleB) = ModuleC(moduleA, moduleB)

    @Provides
    fun provideModuleD(moduleA: ModuleA, moduleC: ModuleC) = ModuleD(moduleC, moduleA)

    @Provides
    fun provideModuleE(moduleD: ModuleD, moduleB: ModuleB) = ModuleE(moduleB, moduleD)
}