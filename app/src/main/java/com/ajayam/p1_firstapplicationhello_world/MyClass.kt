package com.ajayam.p1_firstapplicationhello_world

class MyClass {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello world")

            var num = 10;

//   while loop
//            while (num<20){
//                println("Num is: $num")
//                num++;
//            }

//   do-while loop
            do {
                println("Num is : $num")
            } while (num>10)


        }
    }
}
