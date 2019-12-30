object LearningScala4 {
  // Data structures
  
  // Tuples (Also really common with Spark!!)
  // Immutable lists
  // Often thought of as database fields, or columns.
  // Useful for passing around entire rows of data.
  
  val captainStuff = ("Picard","Enterprise-D", "NCC-1701-D")
                                                  //> captainStuff  : (String, String, String) = (Picard,Enterprise-D,NCC-1701-D)
                                                  //| 
  println(captainStuff)                           //> (Picard,Enterprise-D,NCC-1701-D)
  
  // You refer to individual fields with their ONE-BASED index:
  println(captainStuff._1)                        //> Picard
  println(captainStuff._2)                        //> Enterprise-D
  println(captainStuff._3)                        //> NCC-1701-D
 
 // You can create a key/value pair with ->
 val picardsShip = "Picard" -> "Enterprise-D"     //> picardsShip  : (String, String) = (Picard,Enterprise-D)
 println(picardsShip._2)                          //> Enterprise-D
 
 // You can mix different types in a tuple
 val aBunchOfStuff = ("Kirk", 1964, true)         //> aBunchOfStuff  : (String, Int, Boolean) = (Kirk,1964,true)
 
 
 
 // Lists
 // Like a tuple, but it's an actual Collection object that has more functionality.
 // It's a singly-linked list under the hood.
 
 val shipList = List("Enterprise", "Defiant", "Voyager", "Deep Space Nine","head","tail","1","2","3")
                                                  //> shipList  : List[String] = List(Enterprise, Defiant, Voyager, Deep Space Nin
                                                  //| e, head, tail, 1, 2, 3)
 
 // Access individual members using () with ZERO-BASED index (confused yet?)
 println(shipList(1))                             //> Defiant
 //list starts from zero index while tuples strats with the index of one
 // head and tail give you the first item, and the remaining ones.
 println(shipList.head)                           //> Enterprise
 println(shipList.tail)                           //> List(Defiant, Voyager, Deep Space Nine, head, tail, 1, 2, 3)
 
 
 // Iterating though a list
 for (ship <- shipList) {println(ship)}           //> Enterprise
                                                  //| Defiant
                                                  //| Voyager
                                                  //| Deep Space Nine
                                                  //| head
                                                  //| tail
                                                  //| 1
                                                  //| 2
                                                  //| 3
 
 // Let's apply a function literal to a list! map() can be used to apply any function to every item in a collection.
val backwardShips = shipList.map( (ship: String) => {ship.reverse})
                                                  //> backwardShips  : List[String] = List(esirpretnE, tnaifeD, regayoV, eniN eca
                                                  //| pS peeD, daeh, liat, 1, 2, 3)

val back = shipList.map ( (ship1 :String)=> {ship1.toUpperCase()})
                                                  //> back  : List[String] = List(ENTERPRISE, DEFIANT, VOYAGER, DEEP SPACE NINE, 
                                                  //| HEAD, TAIL, 1, 2, 3)
 for (ship <- backwardShips) {println(ship)}      //> esirpretnE
                                                  //| tnaifeD
                                                  //| regayoV
                                                  //| eniN ecapS peeD
                                                  //| daeh
                                                  //| liat
                                                  //| 1
                                                  //| 2
                                                  //| 3
  for(ship1 <-back) { println(ship1)}             //> ENTERPRISE
                                                  //| DEFIANT
                                                  //| VOYAGER
                                                  //| DEEP SPACE NINE
                                                  //| HEAD
                                                  //| TAIL
                                                  //| 1
                                                  //| 2
                                                  //| 3
// reduce() can be used to combine together all the items in a collection using some function.
val numberList = List(1, 2, 3, 4, 5)              //> numberList  : List[Int] = List(1, 2, 3, 4, 5)
val sum = numberList.reduce( (x: Int, y: Int) => x + y)
                                                  //> sum  : Int = 15
println(sum)                                      //> 15
val multiple=numberList.reduce((x:Int,y :Int)=>x*y)
                                                  //> multiple  : Int = 120
print(multiple)                                   //> 120


// filter() can remove stuff you don't want. Here we'll introduce wildcard syntax while we're at it.
val iHateFives = numberList.filter( (x: Int) => x != 5)
                                                  //> iHateFives  : List[Int] = List(1, 2, 3, 4)
val iHateThrees = numberList.filter(_ != 3)       //> iHateThrees  : List[Int] = List(1, 2, 4, 5)

// Note that Spark has its own map, reduce, and filter functions that can distribute these operations. But they work the same way!
// Also, you understand MapReduce now :)

// Concatenating lists
val moreNumbers = List(6, 7, 8)                   //> moreNumbers  : List[Int] = List(6, 7, 8)
val lotsOfNumbers = numberList ++ moreNumbers     //> lotsOfNumbers  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8)

// More list fun
val reversed = numberList.reverse                 //> reversed  : List[Int] = List(5, 4, 3, 2, 1)
val sorted = reversed.sorted                      //> sorted  : List[Int] = List(1, 2, 3, 4, 5)
val lotsOfDuplicates = numberList ++ numberList   //> lotsOfDuplicates  : List[Int] = List(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
val distinctValues = lotsOfDuplicates.distinct    //> distinctValues  : List[Int] = List(1, 2, 3, 4, 5)
val maxValue = numberList.max                     //> maxValue  : Int = 5
val total = numberList.sum                        //> total  : Int = 15
val hasThree = iHateThrees.contains(3)            //> hasThree  : Boolean = false

// Maps
// Useful for key/value lookups on distinct keys
// Like dictionaries in other languages

val shipMap = Map("Kirk" -> "Enterprise", "Picard" -> "Enterprise-D", "Sisko" -> "Deep Space Nine", "Janeway" -> "Voyager")
                                                  //> shipMap  : scala.collection.immutable.Map[String,String] = Map(Kirk -> Ente
                                                  //| rprise, Picard -> Enterprise-D, Sisko -> Deep Space Nine, Janeway -> Voyage
                                                  //| r)
println(shipMap("Kirk"))                          //> Enterprise

// Dealing with missing keys
println(shipMap.contains("Archer"))               //> false

val archersShip = util.Try(shipMap("Picard")) getOrElse "Unknown"
                                                  //> archersShip  : String = Enterprise-D
println(archersShip)                              //> Enterprise-D

// EXERCISE
// Create a list of the numbers 1-20; your job is to print out numbers that are evenly divisible by three. (Scala's
// modula operator, like other languages, is %, which gives you the remainder after division. For example, 9 % 3 = 0
// because 9 is evenly divisible by 3.) Do this first by iterating through all the items in the list and testing each
// one as you go. Then, do it again by using a filter function on the list instead.

// That's enough for now!
// There is MUCH more to learn about Scala. We didn't cover many other collection types, including mutable collections.
// And we didn't even touch on object-oriented Scala. The book "Learning Scala" from O'Reilly is great if you want to
// go into more depth - but you've got enough to get through this course for now.
val numberList1 = List(1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12,13,14,15,16,17,18,19,20)
                                                  //> numberList1  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 
                                                  //| 14, 15, 16, 17, 18, 19, 20)
for(i<-1 to 20){
    if(i%3==0)
    {
    println(i)
    }                                             //> 3
                                                  //| 6
                                                  //| 9
                                                  //| 12
                                                  //| 15
                                                  //| 18
    }
 val divbythree= numberList1.filter((x:Int)=> x%3==0)
                                                  //> divbythree  : List[Int] = List(3, 6, 9, 12, 15, 18)
	println(divbythree)                       //> List(3, 6, 9, 12, 15, 18)

}