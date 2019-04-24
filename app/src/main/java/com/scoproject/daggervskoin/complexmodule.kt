package com.scoproject.daggervskoin

/**
 * Created by ibnumuzzakkir on 2019-04-24.
 * Mobile Engineer
 */

class ModuleA {
    init {

    }
}
class ModuleB
class ModuleC(val a: ModuleA, val b: ModuleB)
class ModuleD(val c: ModuleC, val a: ModuleA)
class ModuleE(val b: ModuleB, val d: ModuleD)