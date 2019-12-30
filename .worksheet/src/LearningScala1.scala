object LearningScala1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(90); 
  // VALUES are immutable constants.
  	val hello:String ="hello!";System.out.println("""hello  : String = """ + $show(hello ));$skip(18); 
  	println(hello);$skip(29); 
 
  var hola :String = hello;System.out.println("""hola  : String = """ + $show(hola ));$skip(24); 
  hola = hello +"fcuk!";$skip(16); 
  println(hola);$skip(32); 

  val hola1 = hello + "There!";System.out.println("""hola1  : String = """ + $show(hola1 ));$skip(17); 
  println(hola1);$skip(30); 
  

  val numberOne : Int = 1;System.out.println("""numberOne  : Int = """ + $show(numberOne ));$skip(18); 
  val num: Int =2;System.out.println("""num  : Int = """ + $show(num ));$skip(29); 
  val truth : Boolean = true;System.out.println("""truth  : Boolean = """ + $show(truth ));$skip(24); 
  val t: Boolean = true;System.out.println("""t  : Boolean = """ + $show(t ));$skip(27); 
  val letterA : Char = 'a';System.out.println("""letterA  : Char = """ + $show(letterA ));$skip(27); 
  val letterB : Char = 'b';System.out.println("""letterB  : Char = """ + $show(letterB ));$skip(31); 
  val pi : Double = 3.14159265;System.out.println("""pi  : Double = """ + $show(pi ));$skip(34); 
  val sqrt :Double = math.sqrt(3);System.out.println("""sqrt  : Double = """ + $show(sqrt ));$skip(46); 
  val piSinglePrecision : Float = 3.14159265f;System.out.println("""piSinglePrecision  : Float = """ + $show(piSinglePrecision ));$skip(36); 
  val sqar : Double = math.pow(4,2);System.out.println("""sqar  : Double = """ + $show(sqar ));$skip(37); 
  val bigNumber : Long = 1234567890l;System.out.println("""bigNumber  : Long = """ + $show(bigNumber ));$skip(32); 
  val smallNumber : Byte = -128;System.out.println("""smallNumber  : Byte = """ + $show(smallNumber ));$skip(141); 
  
  // String printing tricks
  // Concatenating stuff with +:
  println("Here is a mess: " + numberOne + truth + letterA + pi + bigNumber);$skip(65); 
  println("fuck this expression" +"\t"+num +"\t"+t+"\t"+letterB);$skip(68); 
  // printf style:
  println(f"Pi is about $piSinglePrecision%.3f");$skip(55); 
  println(f"Zero padding on the left: $numberOne%05d");$skip(58); 
  println(f"sqaure root values for 3 is about $sqrt%.3f");$skip(54); 
  println(f"square value of the value 4 is $num%05d");$skip(118); 
  // Substituting in variables:
  println(s"I can use the s prefix to use variables like $numberOne $truth $letterA");$skip(48); 
  println(s"its a mess to begin $num $letterB");$skip(150); 
  // Substituting expressions (with curly brackets):
  println(s"The s prefix isn't limited to variables; I can include any expression. Like ${1+2}");$skip(104); 
  
  println(s"The s prefix isn't limited to variables: I can include any expression. ${math.sqrt(2)}");$skip(163); 
                                                 
  // Using regular expressions:
  val theUltimateAnswer: String = "To life, the universe, and everything is 42.";System.out.println("""theUltimateAnswer  : String = """ + $show(theUltimateAnswer ));$skip(37); 
  val pattern = """.* ([\d]+).*""".r;System.out.println("""pattern  : scala.util.matching.Regex = """ + $show(pattern ));$skip(48); 
  val pattern(answerString) = theUltimateAnswer;System.out.println("""answerString  : String = """ + $show(answerString ));$skip(34); 
  val answer = answerString.toInt;System.out.println("""answer  : Int = """ + $show(answer ));$skip(18); 
  println(answer);$skip(54); 
  
  // Dealing with booleans
  val isGreater = 1 > 2;System.out.println("""isGreater  : Boolean = """ + $show(isGreater ));$skip(23); 
  val isLesser = 1 < 2;System.out.println("""isLesser  : Boolean = """ + $show(isLesser ));$skip(40); 
  val impossible = isGreater & isLesser;System.out.println("""impossible  : Boolean = """ + $show(impossible ));$skip(41); 
  val anotherWay = isGreater && isLesser;System.out.println("""anotherWay  : Boolean = """ + $show(anotherWay ));$skip(36); 
  
  val picard: String = "Picard";System.out.println("""picard  : String = """ + $show(picard ));$skip(37); 
  val bestCaptain: String = "Picard";System.out.println("""bestCaptain  : String = """ + $show(bestCaptain ));$skip(46); 
  val isBest: Boolean = picard == bestCaptain;System.out.println("""isBest  : Boolean = """ + $show(isBest ));$skip(299); 
  
  // EXERCISE
  // Write some code that takes the value of pi, doubles it, and then prints it within a string with
  // three decimal places of precision to the right.
  // Just write your code below here; any time you save the file it will automatically display the results!
  
  val px =(pi*2);System.out.println("""px  : Double = """ + $show(px ));$skip(29); 
 	val px1: Float =px.toFloat;System.out.println("""px1  : Float = """ + $show(px1 ));$skip(48); 
  println(f"the expression lies here $px1%.3f")}
  //val pattern2="""[+-]?\\d+\\.?(\\d+)?""".r
  //val pattern2="""\d(.\d{3})?.*""".r
  //val pattern1 = """.(\d{1}\.)?..*""".r
  //val pattern2(p3)= p1
  // println(p3)
  
}
