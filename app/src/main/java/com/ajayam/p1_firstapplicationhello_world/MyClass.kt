package com.ajayam.p1_firstapplicationhello_world

class MyClass {
    companion object{
        @JvmStatic
        fun main(args: Array<String>){

            println("The sum of A and B is ${add(5, 6, 11)}")
         }
        fun add(a:Int, b:Int) : Int {
            return a+b
        }
        fun add(a:Int, b: Int, c:Int) :  Int {
            return a+b+c
        }
    }
}