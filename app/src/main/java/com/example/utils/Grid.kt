package com.example.utils

class Grid(var width : Int, var height : Int, var sizeCase : Int = 10) {
    val matrix : Array<IntArray> = array2dOfInt(height, width)
    
    fun printGrid() : String {
        var str = ""
        for(y in 0 until height){
            str+="{ "
            for(x in 0 until width){
                str+="${matrix[y][x]} "
            }
            str+="}\n"
        }
        return str
    }
}