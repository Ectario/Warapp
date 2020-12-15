package com.example.`object`

import com.example.`object`.ID_manager.generateNewID

class Camp(override var x : Int, override var y: Int) : Building() {
    override var health: Int = 100
    override val id = generateNewID()

}