@main def hello: Unit =
  println("Hello world!, I am learning Scala :) ")
  println(msg)
  println(sum(4,5))
  println(turnOnLight(true))
  println(turnOnLight(false))
  println(turnOnLight())
  println(greetMe("John"))
  println(partyAtHome(5, false))
  println(partyAtHome(5, true))
  println(competition(1))
  println(competition(10))
  println(competition(3))

def msg = "I was compiled by Scala 3. :)"
def sum(num1: Int, num2: Int): Int = num1 + num2

def turnOnLight(switchOn: Boolean = false): String = if switchOn then "Lights on!" else "Lights off!"

def greetMe(name: String): String = s"Hello $name!"

def partyAtHome(guests: Int, tentAvailable: Boolean): String =
  if guests < 10 && tentAvailable then "Let's party hard.... ;) "
  else "No party :( "

def competition(result: Int): String = result match
  case 1 => "Gold!!!"
  case 2 => "Silver!!"
  case 3 => "Bronze!"
  case _ => "Good Luck next time."
