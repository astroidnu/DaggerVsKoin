package com.scoproject.daggervskoin.koin

import com.scoproject.daggervskoin.*
import org.koin.dsl.module.module

/**
 * Created by ibnumuzzakkir on 2019-04-24.
 * Mobile Engineer
 */

val koinModule = module {
    factory { ModuleA() }
    factory { ModuleB() }
    factory { ModuleC(get(), get()) }
    factory { ModuleD(get(), get()) }
    factory { ModuleE(get(), get()) }
}