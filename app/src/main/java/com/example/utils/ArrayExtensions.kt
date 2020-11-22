package com.example.utils

public fun array2dOfInt(height: Int, width: Int): Array<IntArray>
        = Array(height) { IntArray(width) }
public fun array2dOfLong(height: Int, width: Int): Array<LongArray>
        = Array(height) { LongArray(width) }
public fun array2dOfByte(height: Int, width: Int): Array<ByteArray>
        = Array(height) { ByteArray(width) }
public fun array2dOfChar(height: Int, width: Int): Array<CharArray>
        = Array(height) { CharArray(width) }
public fun array2dOfBoolean(height: Int, width: Int): Array<BooleanArray>
        = Array(height) { BooleanArray(width) }