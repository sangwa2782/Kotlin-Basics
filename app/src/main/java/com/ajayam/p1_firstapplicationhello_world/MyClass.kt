package com.ajayam.p1_firstapplicationhello_world

class MyClass {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello world")

//            var (a,b) = Pair("a", 1)
//            println("$a $b")

// Two value store
//            val name = Pair("Raman", Pair("Ramanujan", Pair("Ajayam", 1)))
//            println("${name.first} ${name.second.second.first}")

// Three value store
//            val (x,y,z) = Triple("hello", "World", 1)
//            println("$x $y $z")

//            val number = Triple("hello", "World", 1)
//            println("$number")

            val number = Triple("hello", "World", Triple(1,Triple("a","b","c"),3))
            println("${number.third.second}")


        }
    }
}
