package com.example.FizzBuzz {
object FizzBuzz {
  def main(args: Array[String]) {
   fizzBuzz(1,100)
  }

  final def fizzBuzz(cur: Int, end: Int) : Int = {
   if( cur > end ) {
    return 0
   } 

   var isFizz = cur%3 == 0
   var isBuzz = cur%5 == 0
   if( isFizz ) {
    print("Fizz")
   }

   if( isBuzz ) {
    print("Buzz")
   }
 
   if( !isFizz && !isBuzz ) {
    print(cur)
   }
 
   println()
   fizzBuzz(cur+1,end)
  }
}
}
