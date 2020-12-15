package com.example.`object`

enum class ObjectType{
    BUILDING,
    TROOP,
}

open interface ObjectWarapp{
    var x : Int
    var y : Int
    var speed : Int
    var health : Int
    val id : Int
    val objectType : ObjectType
}

object ID_manager{
    lateinit var listId : ArrayList<Int>
    fun generateNewID() : Int{
        if(listId.size<1){
            listId.add(1)
            return 1
        }
        listId.add(listId.last()+1)
        return listId.last()+1
    }
}
