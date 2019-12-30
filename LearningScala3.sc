object LearningScala3 {
  // Functions
  
  // Format is def <function name>(parameter name: type...) : return type = { expression }
  // Don't forget the = before the expression!
  def squareIt(x: Int) : Int = {
  	x * x
  }                                               //> squareIt: (x: Int)Int
  
  def cubeIt(x: Int): Int = {x * x * x}           //> cubeIt: (x: Int)Int
  
  println(squareIt(2))                            //> 4
  
  println(cubeIt(2))                              //> 8
  
  def power(x1: Double) : Double ={ math.sqrt(x1)}//> power: (x1: Double)Double
  
  print(power(2))                                 //> 1.4142135623730951
  
  // Functions can take other functions as parameters
  
  def transformInt(x: Int, f: Int => Int) : Int = {
  	f(x)
  }                                               //> transformInt: (x: Int, f: Int => Int)Int
    
  def newtransform(x:Double, f1:Double=> Double) :Double ={
  f1(x)
  }                                               //> newtransform: (x: Double, f1: Double => Double)Double
   val res = newtransform(2.0,power)              //> res  : Double = 1.4142135623730951
   print(res)                                     //> 1.4142135623730951
   
  val result = transformInt(2, cubeIt)            //> result  : Int = 8
  println (result)                                //> 8
  
  // "Lambda functions", "anonymous functions", "function literals"
  // You can declare functions inline without even giving them a name
  // This happens a lot in Spark.
  transformInt(3, x => x * x * x)                 //> res0: Int = 27
  
  transformInt(10, x => x / 2)                    //> res1: Int = 5
  
  transformInt(2, x => {val y = x * 2; y * y})    //> res2: Int = 16
  
  // This is really important!
  
  // EXERCISE
  // Strings have a built-in .toUpperCase method. For example, "foo".toUpperCase gives you back FOO.
  // Write a function that converts a string to upper-case, and use that function of a few test strings.
  // Then, do the same thing using a function literal instead of a separate, named function.
   
    val str : String ="my name si nishant"        //> str  : String = my name si nishant
    val result1=str.toUpperCase()                 //> result1  : String = MY NAME SI NISHANT
    println(result1)                              //> MY NAME SI NISHANT
    
    def conv (st:String) : String = {
    st.toUpperCase()
    }                                             //> conv: (st: String)String
    println(conv(str))                            //> MY NAME SI NISHANT
    
    
 // taking function as paramenter
 
 val str1: String ="To bridge the gap between every method returning something and not having anything useful to return, there's Unit. This type is an AnyVal, which means it isn't allocated on the heap, unless it gets boxed or is the type of a field on an object. Furthermore, it has only one value, whose literal is (). That is, you could write this:"
                                                  //> str1  : String = To bridge the gap between every method returning something
                                                  //|  and not having anything useful to return, there's Unit. This type is an An
                                                  //| yVal, which means it isn't allocated on the heap, unless it gets boxed or i
                                                  //| s the type of a field on an object. Furthermore, it has only one value, who
                                                  //| se literal is (). That is, you could write this:
 def transformString(xn: String, f5: String => String) : String = {
 f5(xn)
 }                                                //> transformString: (xn: String, f5: String => String)String
   val resultst : String = transformString(str1,conv)
                                                  //> resultst  : String = TO BRIDGE THE GAP BETWEEN EVERY METHOD RETURNING SOMET
                                                  //| HING AND NOT HAVING ANYTHING USEFUL TO RETURN, THERE'S UNIT. THIS TYPE IS A
                                                  //| N ANYVAL, WHICH MEANS IT ISN'T ALLOCATED ON THE HEAP, UNLESS IT GETS BOXED 
                                                  //| OR IS THE TYPE OF A FIELD ON AN OBJECT. FURTHERMORE, IT HAS ONLY ONE VALUE,
                                                  //|  WHOSE LITERAL IS (). THAT IS, YOU COULD WRITE THIS:
println (resultst)                                //> TO BRIDGE THE GAP BETWEEN EVERY METHOD RETURNING SOMETHING AND NOT HAVING A
                                                  //| NYTHING USEFUL TO RETURN, THERE'S UNIT. THIS TYPE IS AN ANYVAL, WHICH MEANS
                                                  //|  IT ISN'T ALLOCATED ON THE HEAP, UNLESS IT GETS BOXED OR IS THE TYPE OF A F
                                                  //| IELD ON AN OBJECT. FURTHERMORE, IT HAS ONLY ONE VALUE, WHOSE LITERAL IS ().
                                                  //|  THAT IS, YOU COULD WRITE THIS:
  
}