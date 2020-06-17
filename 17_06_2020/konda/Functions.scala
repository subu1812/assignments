package com.info.day4

object Functions {
  def display() = {
    println("welcome to scala training session")
  }
  def display(name: String) = {
    println("welcome to scala training session " + name)
    println(s"welcome to scala training session  $name")
  }

  def main(args: Array[String]): Unit = {
    display();
    display("konda")
    // names parameters
    display(name = "ust")
  }
}
