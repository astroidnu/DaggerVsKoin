package com.scoproject.daggervskoin

/**
 * Created by ibnumuzzakkir on 2019-04-24.
 * Mobile Engineer
 */

class ModuleA
class ModuleB
class ModuleC(val a: ModuleA, val b: ModuleB)
class ModuleD(val c: ModuleC, val a: ModuleA)
class ModuleE(val b: ModuleB, val d: ModuleD)
class ModuleF(val e: ModuleE, val d: ModuleD)
class ModuleG(val f: ModuleF, val e: ModuleE)
class ModuleH(val g: ModuleG, val f: ModuleF)
class ModuleI(val h: ModuleH, val g: ModuleG)
class ModuleJ(val i: ModuleI, val h: ModuleH) {
    fun getName(): String {
        return "TestingDagger&Koin"
    }
}