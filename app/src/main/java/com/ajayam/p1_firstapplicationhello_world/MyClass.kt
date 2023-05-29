package com.ajayam.p1_firstapplicationhello_world

class MyClass {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            println("Hello world")

//cannot change the value at runtime
        val arrNames = ArrayList<String>()
            arrNames.add("A")
            arrNames.add("B")

            arrNames[0]="Raman"

//            arrNames.remove("B")
            arrNames.removeAt(1)

            println(arrNames.toString())
        }
    }
}
