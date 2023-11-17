@main def hello: Unit =
  println("Hello world!, I am learning Scala :) ")
  println(msg)
  println(sum(4,5))

def msg = "I was compiled by Scala 3. :)"
def sum(num1: Int, num2: Int): Int = num1 + num2