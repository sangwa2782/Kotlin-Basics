package com.ajayam.p1_firstapplicationhello_world

class MyClass {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            var num = 11
// way of writing 1
//            if (num > 100) {
//                println("No is grater")
//            } else {
//                println("No is smaller")
//            }

// way of writing 2 ({} not important on if-else)
//            if (num > 100)
//                println("No is grater")
//            else
//                println("No is smaller")

// way of writing 3 (single if-else can write on single line)
            var msg = ""
            msg =  if (num > 100) "No is grater" else "No is smaller"
            println(msg)


// nested conditional
            if(num>100){

            } else if (num<70) {

            } else if (num< 50) {

            } else {

            }

// WHEN in place of switch condition
            when(num){
                1->{
//                -> sign of equal to(=) eg. 1=num
                }
                100-> {

                }
            }

// conditional operators used
            when{
                num>100 -> {

                }
                num<100->{

                }
                num==100->{

                }
                else -> {

                }
            }



        }
    }
}
