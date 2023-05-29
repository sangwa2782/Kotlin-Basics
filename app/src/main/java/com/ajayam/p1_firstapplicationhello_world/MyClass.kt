package com.ajayam.p1_firstapplicationhello_world

class MyClass {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            println("Hello world")

//cannot change the value at runtime
            val aMap = mapOf(1 to "Raman", 10 to  "Rahul", true to "check")
            println(aMap)

            val mMap = mutableMapOf<Int, String>()
            val mAMap = mutableMapOf(1 to "Raj", 12 to "Rohit", 11 to "Rajeev")
            mMap.putAll(mAMap)

            mMap[1]="Raman"
            println(mMap)
        }
    }
}
