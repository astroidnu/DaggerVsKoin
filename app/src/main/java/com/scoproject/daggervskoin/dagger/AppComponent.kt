package com.scoproject.daggervskoin.dagger

import android.app.Application
import com.scoproject.daggervskoin.App
import com.scoproject.daggervskoin.dagger.builder.ActivityBuilder
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule

/**
 * Created by ibnumuzzakkir on 2019-04-24.
 * Mobile Engineer
 */
@Component(modules = [
    (AndroidInjectionModule::class),
    (DaggerModule::class),
    (ActivityBuilder::class)
])
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }

    fun inject(app: App)
}