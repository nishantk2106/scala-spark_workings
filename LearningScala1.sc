object LearningScala1 {
  // VALUES are immutable constants.
  	val hello:String ="hello!"                //> hello  : String = hello!
  	println(hello)                            //> hello!
 
  var hola :String = hello                        //> hola  : String = hello!
  hola = hello +"fcuk!"
  println(hola)                                   //> hello!fcuk!

  val hola1 = hello + "There!"                    //> hola1  : String = hello!There!
  println(hola1)                                  //> hello!There!
  

  val numberOne : Int = 1                         //> numberOne  : Int = 1
  val num: Int =2                                 //> num  : Int = 2
  val truth : Boolean = true                      //> truth  : Boolean = true
  val t: Boolean = true                           //> t  : Boolean = true
  val letterA : Char = 'a'                        //> letterA  : Char = a
  val letterB : Char = 'b'                        //> letterB  : Char = b
  val pi : Double = 3.14159265                    //> pi  : Double = 3.14159265
  val sqrt :Double = math.sqrt(3)                 //> sqrt  : Double = 1.7320508075688772
  val piSinglePrecision : Float = 3.14159265f     //> piSinglePrecision  : Float = 3.1415927
  val sqar : Double = math.pow(4,2)               //> sqar  : Double = 16.0
  val bigNumber : Long = 1234567890l              //> bigNumber  : Long = 1234567890
  val smallNumber : Byte = -128                   //> smallNumber  : Byte = -128
  
  // String printing tricks
  // Concatenating stuff with +:
  println("Here is a mess: " + numberOne + truth + letterA + pi + bigNumber)
                                                  //> Here is a mess: 1truea3.141592651234567890
  println("fuck this expression" +"\t"+num +"\t"+t+"\t"+letterB)
                                                  //> fuck this expression	2	true	b
  // printf style:
  println(f"Pi is about $piSinglePrecision%.3f")  //> Pi is about 3.142
  println(f"Zero padding on the left: $numberOne%05d")
                                                  //> Zero padding on the left: 00001
  println(f"sqaure root values for 3 is about $sqrt%.3f")
                                                  //> sqaure root values for 3 is about 1.732
  println(f"square value of the value 4 is $num%05d")
                                                  //> square value of the value 4 is 00002
  // Substituting in variables:
  println(s"I can use the s prefix to use variables like $numberOne $truth $letterA")
                                                  //> I can use the s prefix to use variables like 1 true a
  println(s"its a mess to begin $num $letterB")   //> its a mess to begin 2 b
  // Substituting expressions (with curly brackets):
  println(s"The s prefix isn't limited to variables; I can include any expression. Like ${1+2}")
                                                  //> The s prefix isn't limited to variables; I can include any expression. Like
                                                  //|  3
  
  println(s"The s prefix isn't limited to variables: I can include any expression. ${math.sqrt(2)}")
                                                  //> The s prefix isn't limited to variables: I can include any expression. 1.41
                                                  //| 42135623730951
                                                 
  // Using regular expressions:
  val theUltimateAnswer: String = "To life, the universe, and everything is 42."
                                                  //> theUltimateAnswer  : String = To life, the universe, and everything is 42.
                                                  //| 
  val pattern = """.* ([\d]+).*""".r              //> pattern  : scala.util.matching.Regex = .* ([\d]+).*
  val pattern(answerString) = theUltimateAnswer   //> answerString  : String = 42
  val answer = answerString.toInt                 //> answer  : Int = 42
  println(answer)                                 //> 42
  
  // Dealing with booleans
  val isGreater = 1 > 2                           //> isGreater  : Boolean = false
  val isLesser = 1 < 2                            //> isLesser  : Boolean = true
  val impossible = isGreater & isLesser           //> impossible  : Boolean = false
  val anotherWay = isGreater && isLesser          //> anotherWay  : Boolean = false
  
  val picard: String = "Picard"                   //> picard  : String = Picard
  val bestCaptain: String = "Picard"              //> bestCaptain  : String = Picard
  val isBest: Boolean = picard == bestCaptain     //> isBest  : Boolean = true
  
  // EXERCISE
  // Write some code that takes the value of pi, doubles it, and then prints it within a string with
  // three decimal places of precision to the right.
  // Just write your code below here; any time you save the file it will automatically display the results!
  
  val px =(pi*2)                                  //> px  : Double = 6.2831853
 	val px1: Float =px.toFloat                //> px1  : Float = 6.2831855
  println(f"the fucking expression lies here $px1%.3f")
                                                  //> the fucking expression lies here 6.283
  //val pattern2="""[+-]?\\d+\\.?(\\d+)?""".r
  //val pattern2="""\d(.\d{3})?.*""".r
  //val pattern1 = """.(\d{1}\.)?..*""".r
  //val pattern2(p3)= p1
  // println(p3)
  
}