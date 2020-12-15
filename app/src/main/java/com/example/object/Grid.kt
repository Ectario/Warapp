package com.example.`object`

class Grid(var width : Int, var height : Int, var sizeCase : Int = 10) {
    var matrixTiles : Array<Array<Tile?>> = array2dOfTile(height, width) //With (x,y) coordonate :  matrix[y][x] is the value of (x,y)

    init{
        initGrid(width, height, sizeCase)
    }

    fun initGrid( w: Int = width, h : Int = height, sizeC : Int = 10){
        this.width = w
        this.height = h
        this.sizeCase = sizeC
        this.matrixTiles = array2dOfTile(height, width)

        for(x in 0 until width){
            for(y in 0 until height){
                matrixTiles[y][x] = Tile(x,y,CaseType.values().random()) //we load the map with random generation at 100%
            }
        }
    }

    fun gridToString() : String {
        var str = "GRID printed :\n"
        for(y in 0 until height){
            str+="{ "
            for(x in 0 until width){
                str+="${matrixTiles[y][x]?.type} "
            }
            str+="}\n"
        }
        return str
    }
}