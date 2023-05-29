package com.ajayam.p1_firstapplicationhello_world

class MyClass {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            println("Hello world")

//cannot change the value at runtime
            val aSet = setOf("12", 1, "Raj", "Rahul")

            println(aSet)

// Addition on SET
            val mSet = mutableSetOf("Raj", "Rajesh", 1, false)

            mSet.add(true)
            println(mSet)

        }
    }
}
