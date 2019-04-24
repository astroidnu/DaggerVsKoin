package com.scoproject.daggervskoin

import android.app.Activity
import android.app.Application
import android.os.Debug
import com.frogermcs.androiddevmetrics.AndroidDevMetrics
import com.scoproject.daggervskoin.dagger.AppComponent
import com.scoproject.daggervskoin.dagger.DaggerAppComponent
import com.scoproject.daggervskoin.koin.koinComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import org.koin.android.ext.android.startKoin
import javax.inject.Inject

/**
 * Created by ibnumuzzakkir on 2019-04-24.
 * Mobile Engineer
 */
class App : Application(), HasActivityInjector {
    companion object {
        @JvmStatic
        lateinit var daggerComponent: AppComponent
    }

    @Inject
    lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            AndroidDevMetrics.initWith(this)
        }
        //Create App Component
        Debug.startMethodTracing("DaggerCreateComponent")
        daggerComponent = createComponent()
        Debug.stopMethodTracing()
        daggerComponent.inject(this)
        //Start Koin
        Debug.startMethodTracing("KoinCreateComponent")
        startKoin(this@App, koinComponent)
        Debug.stopMethodTracing()
    }



    /**
     * Initialize Dependency Injection With Dagger
     * Level DI Application
     * */

    private fun createComponent(): AppComponent {
       return DaggerAppComponent.builder()
            .application(this)
            .build()
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return activityDispatchingAndroidInjector
    }
}