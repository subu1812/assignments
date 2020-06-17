package com.info.day4

object MethodOverloading {
  def display(id: Int, name: String) = {
    println(s"m2 id = $id name=$name")
  }

  def display(name: String, id: Int) = {
    println(s"m2 name = $name id=$id")
  }

  def display(id: Int, name: String, sal: Double) = {
    println(s"m3 name = $name id=$id sal=$sal")
  }

  def display(id: Int, sal: Double = 100, name: String) = {
    println(s" m4 name = $name  sal=$sal id=$id sal=$sal")
  }

  def main(args: Array[String]): Unit = {
//    display(id=10,name="abc") won't work
    display(10, "ABC")
    display("ABC", 10)
    display(10, "ABC", 5000)
//    display(id=10,name = "ABC",sal = 5000) won't work becouse of optional value in middle of parameter
  }
}
