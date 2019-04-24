package com.scoproject.daggervskoin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Debug
import android.util.Log
import dagger.android.AndroidInjection
import org.koin.android.ext.android.inject
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var moduleA : ModuleA

    private val moduleKoinA : ModuleA by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        Debug.startMethodTracing("Layout")
        setContentView(R.layout.activity_main)
        Debug.stopMethodTracing()
//        Log.d(javaClass.name, moduleA.toString())
        Debug.startMethodTracing("InjectDagger")
        Log.d(javaClass.name, moduleA.toString())
        Debug.stopMethodTracing()

        Debug.startMethodTracing("InjectKoin")
        Log.d(javaClass.name, moduleKoinA.toString())
        Debug.stopMethodTracing()
    }
}
