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

    @Provides
    fun provideModuleF(e: ModuleE, d: ModuleD) = ModuleF(e, d)

    @Provides
    fun provideModuleG(f: ModuleF, e: ModuleE) = ModuleG(f, e)

    @Provides
    fun provideModuleH(g: ModuleG, f: ModuleF) = ModuleH(g, f)

    @Provides
    fun provideModuleI(h: ModuleH, g: ModuleG) = ModuleI(h, g)

    @Provides
    fun provideModuleJ(i: ModuleI, h: ModuleH) = ModuleJ(i, h)
}