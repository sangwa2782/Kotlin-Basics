package com.ajayam.p1_firstapplicationhello_world

class MyClass {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello world")

            var num = 0

// run 0 to 10
//            for (i in 0..10){
//                println("Number is : ${num++}")
//            }

// run 0 to 9
//            for (i in 0 until 10){
//                println("Number is : ${num++}")
//            }

// run reverse
//            for (i in 10 downTo 0){
//                println("Number is : ${num++}")
//            }

//  run between 2 step
//            for (i in 0..10 step 2){
//                println("Number is : ${num++}")
//            }

// run array list
            val arrNo = ArrayList<Int>()
            arrNo.add(1)
            arrNo.add(2)
            arrNo.add(3)
            arrNo.add(4)
            arrNo.add(5)
            arrNo.add(6)
            arrNo.add(7)

            for (i in arrNo){
                println("Number is : $i")
            }

        }
    }
}
