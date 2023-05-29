package com.ajayam.p1_firstapplicationhello_world

class MyClass {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            println("Hello world")

//cannot change the value at runtime
//            val aList = listOf("Raman", "ajay","anju","anjaali", listOf(1,2,3))
//            println(aList)

//
            val mList = mutableListOf<Any>("Raman", "Rajeev")
// update at runtime
            mList.add(0, "Ramanujan")
//  add at runtime
            mList.add("Ajay")
            mList.add(1)

            val mAList = mutableListOf("Pawan", false)
            mList.addAll(mAList)

            println(mList)

        }
    }
}
