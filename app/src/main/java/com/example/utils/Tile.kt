package com.example.utils

interface Tile {
    var type : CaseType //type of the tile
    var objectIn : List<ObjectWarapp>
}

enum class CaseType{
    CASE_SEA ,
    CASE_GRASS ,
    CASE_ROCK ,
    CASE_BUILDING,
}

