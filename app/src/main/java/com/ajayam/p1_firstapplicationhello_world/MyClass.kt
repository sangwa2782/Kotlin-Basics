package com.ajayam.p1_firstapplicationhello_world

class MyClass {
    companion object{
        @JvmStatic
        fun main(args: Array<String>){
// Var = can change the data at runtime
// val = can't change the data at runtime(it is fixed)           va
            var a = 11
            var b = "Hello"
//            val b = "Hello"

            b = "World"

            a = 7

            println("$a, $b")

//            println("The sum of A and B is ${add(5, 6, 11)}")
         }
//        fun add(a:Int, b:Int) : Int {
//            return a+b
//        }
//        fun add(a:Int, b: Int, c:Int) :  Int {
//            return a+b+c
//        }
    }
}