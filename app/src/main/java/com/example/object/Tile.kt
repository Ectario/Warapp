package com.example.`object`

open class Tile (var posX : Int, var posY : Int, var type : CaseType) {
    lateinit var objectIn : ArrayList<ObjectWarapp>
}

enum class CaseType{
    CASE_SEA ,
    CASE_GRASS ,
    CASE_ROCK
}

