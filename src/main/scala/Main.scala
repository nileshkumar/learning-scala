@main def hello: Unit =
  println("Hello world!, I am learning Scala :) ")
  println(msg)
  println(sum(4,5))
  println(turnOnLight(true))
  println(turnOnLight(false))
  println(turnOnLight())

def msg = "I was compiled by Scala 3. :)"
def sum(num1: Int, num2: Int): Int = num1 + num2

def turnOnLight(switchOn: Boolean = false): String = if switchOn then "Lights on!" else "Lights off!"