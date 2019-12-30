object LearningScala3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(225); 
  // Functions
  
  // Format is def <function name>(parameter name: type...) : return type = { expression }
  // Don't forget the = before the expression!
  def squareIt(x: Int) : Int = {
  	x * x
  };System.out.println("""squareIt: (x: Int)Int""");$skip(43); 
  
  def cubeIt(x: Int): Int = {x * x * x};System.out.println("""cubeIt: (x: Int)Int""");$skip(26); 
  
  println(squareIt(2));$skip(24); 
  
  println(cubeIt(2));$skip(54); 
  
  def power(x1: Double) : Double ={ math.sqrt(x1)};System.out.println("""power: (x1: Double)Double""");$skip(21); 
  
  print(power(2));$skip(124); 
  
  // Functions can take other functions as parameters
  
  def transformInt(x: Int, f: Int => Int) : Int = {
  	f(x)
  };System.out.println("""transformInt: (x: Int, f: Int => Int)Int""");$skip(77); 
    
  def newtransform(x:Double, f1:Double=> Double) :Double ={
  f1(x)
  };System.out.println("""newtransform: (x: Double, f1: Double => Double)Double""");$skip(37); 
   val res = newtransform(2.0,power);System.out.println("""res  : Double = """ + $show(res ));$skip(14); 
   print(res);$skip(43); 
   
  val result = transformInt(2, cubeIt);System.out.println("""result  : Int = """ + $show(result ));$skip(19); 
  println (result);$skip(209); val res$0 = 
  
  // "Lambda functions", "anonymous functions", "function literals"
  // You can declare functions inline without even giving them a name
  // This happens a lot in Spark.
  transformInt(3, x => x * x * x);System.out.println("""res0: Int = """ + $show(res$0));$skip(34); val res$1 = 
  
  transformInt(10, x => x / 2);System.out.println("""res1: Int = """ + $show(res$1));$skip(50); val res$2 = 
  
  transformInt(2, x => {val y = x * 2; y * y});System.out.println("""res2: Int = """ + $show(res$2));$skip(397); 
  
  // This is really important!
  
  // EXERCISE
  // Strings have a built-in .toUpperCase method. For example, "foo".toUpperCase gives you back FOO.
  // Write a function that converts a string to upper-case, and use that function of a few test strings.
  // Then, do the same thing using a function literal instead of a separate, named function.
   
    val str : String ="my name si nishant";System.out.println("""str  : String = """ + $show(str ));$skip(34); 
    val result1=str.toUpperCase();System.out.println("""result1  : String = """ + $show(result1 ));$skip(21); 
    println(result1);$skip(70); 
    
    def conv (st:String) : String = {
    st.toUpperCase()
    };System.out.println("""conv: (st: String)String""");$skip(23); 
    println(conv(str));$skip(399); 
    
    
 // taking function as paramenter
 
 val str1: String ="To bridge the gap between every method returning something and not having anything useful to return, there's Unit. This type is an AnyVal, which means it isn't allocated on the heap, unless it gets boxed or is the type of a field on an object. Furthermore, it has only one value, whose literal is (). That is, you could write this:";System.out.println("""str1  : String = """ + $show(str1 ));$skip(79); 
 def transformString(xn: String, f5: String => String) : String = {
 f5(xn)
 };System.out.println("""transformString: (xn: String, f5: String => String)String""");$skip(54); 
   val resultst : String = transformString(str1,conv);System.out.println("""resultst  : String = """ + $show(resultst ));$skip(19); 
println (resultst)}
  
}
