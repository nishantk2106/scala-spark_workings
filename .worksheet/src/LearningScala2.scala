object LearningScala2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(141); 
  // Flow control
  
  // If / else syntax
  if (1 > 3) println("Impossible!") else println("The world makes sense.");$skip(59); 
  if (5<15) println("possible") else println("impossible");$skip(93); 
  if (1 > 3) {
  	println("Impossible!")
  } else {
  	println("The world makes sense.")
  };$skip(68); 
  
  // Matching - like switch in other languages:
  val number = 3;System.out.println("""number  : Int = """ + $show(number ));$skip(146); 
  number match {
  	case 1 => println("One")
  	case 2 => println("Two")
  	case 3 => println("Three")
  	case _ => println("Something else")
 	};$skip(39); 
 	
 	// case study :
 	val num1  = 'x';System.out.println("""num1  : Char = """ + $show(num1 ));$skip(73); 
 	num1 match {
 	 case 'x' => print(1)
 	 case 'y' => print("five")
 	 };$skip(88); 
 	 
 	// For loops
 	for (x <- 1 to 4) {
 		val squared = x * x
 		println(squared)
 	};$skip(105); 
// for loops
  for (x <-1 to 10){
   val cube =math.pow(x,3)
   val cube1= cube -1
   println(cube1)
  };$skip(29); 
  // While loops
  var x = 5;System.out.println("""x  : Int = """ + $show(x ));$skip(47); 
  while (x >= 0) {
  	println(x)
  	x -= 1
  };$skip(60); 
                                                  
  x = 11;$skip(41); 
  do { println(x); x+=1 } while (x < 11);$skip(154); val res$0 = 
                                                  
   // Expressions
   // "Returns" the final value in a block automatically
   
   {val x = 10; x + 20};System.out.println("""res0: Int = """ + $show(res$0));$skip(82); 
                                                
	 println({val x = 10; x + 20});$skip(259); 
	 
	 // EXERCISE
	 // Write some code that prints out the first 10 values of the Fibonacci sequence.
	 // This is the sequence where every number is the sum of the two numbers before it.
	 // So, the result should be 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
	 var a=0;System.out.println("""a  : Int = """ + $show(a ));$skip(10); 
	 var b=1;System.out.println("""b  : Int = """ + $show(b ));$skip(10); 
	 var c=0;System.out.println("""c  : Int = """ + $show(c ));$skip(13); 
	 println(a);$skip(13); 
	 println(b);$skip(75); 
	  for (x1 <- 2 to 10){
 		 	c=a+b
 		 	a=b
 		 	b=c
 		 	println(c)
	   }}
}
