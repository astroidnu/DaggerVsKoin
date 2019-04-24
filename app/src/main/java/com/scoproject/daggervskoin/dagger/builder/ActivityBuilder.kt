package com.scoproject.daggervskoin.dagger.builder

import com.scoproject.daggervskoin.MainActivity
import com.scoproject.daggervskoin.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector
import javax.inject.Singleton

/**
 * Created by ibnumuzzakkir on 2019-04-24.
 * Mobile Engineer
 */
@Module
abstract class ActivityBuilder {
    @Singleton
    @ContributesAndroidInjector(modules = [(MainModule::class)])
    internal abstract fun bindMain(): MainActivity
}