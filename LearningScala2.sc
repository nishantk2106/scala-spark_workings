object LearningScala2 {
  // Flow control
  
  // If / else syntax
  if (1 > 3) println("Impossible!") else println("The world makes sense.")
                                                  //> The world makes sense.
  if (5<15) println("possible") else println("impossible")
                                                  //> possible
  if (1 > 3) {
  	println("Impossible!")
  } else {
  	println("The world makes sense.")
  }                                               //> The world makes sense.
  
  // Matching - like switch in other languages:
  val number = 3                                  //> number  : Int = 3
  number match {
  	case 1 => println("One")
  	case 2 => println("Two")
  	case 3 => println("Three")
  	case _ => println("Something else")
 	}                                         //> Three
 	
 	// case study :
 	val num1  = 'x'                           //> num1  : Char = x
 	num1 match {
 	 case 'x' => print(1)
 	 case 'y' => print("five")
 	 }                                        //> 1
 	 
 	// For loops
 	for (x <- 1 to 4) {
 		val squared = x * x
 		println(squared)
 	}                                         //> 1
                                                  //| 4
                                                  //| 9
                                                  //| 16
// for loops
  for (x <-1 to 10){
   val cube =math.pow(x,3)
   val cube1= cube -1
   println(cube1)
  }                                               //> 0.0
                                                  //| 7.0
                                                  //| 26.0
                                                  //| 63.0
                                                  //| 124.0
                                                  //| 215.0
                                                  //| 342.0
                                                  //| 511.0
                                                  //| 728.0
                                                  //| 999.0
  // While loops
  var x = 5                                       //> x  : Int = 5
  while (x >= 0) {
  	println(x)
  	x -= 1
  }                                               //> 5
                                                  //| 4
                                                  //| 3
                                                  //| 2
                                                  //| 1
                                                  //| 0
                                                  
  x = 11
  do { println(x); x+=1 } while (x < 11)          //> 11
                                                  
   // Expressions
   // "Returns" the final value in a block automatically
   
   {val x = 10; x + 20}                           //> res0: Int = 30
                                                
	 println({val x = 10; x + 20})            //> 30
	 
	 // EXERCISE
	 // Write some code that prints out the first 10 values of the Fibonacci sequence.
	 // This is the sequence where every number is the sum of the two numbers before it.
	 // So, the result should be 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
	 var a=0                                  //> a  : Int = 0
	 var b=1                                  //> b  : Int = 1
	 var c=0                                  //> c  : Int = 0
	 println(a)                               //> 0
	 println(b)                               //> 1
	  for (x1 <- 2 to 10){
 		 	c=a+b
 		 	a=b
 		 	b=c
 		 	println(c)
	   }                                      //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 5
                                                  //| 8
                                                  //| 13
                                                  //| 21
                                                  //| 34
                                                  //| 55
}