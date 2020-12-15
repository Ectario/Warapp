package com.example.`object`

import com.example.`object`.ID_manager.generateNewID

class Loup(override var x: Int, override var y: Int) : Troop() {
    override var speed: Int = 5
    override var health: Int = 30
    override val id: Int = generateNewID()
}