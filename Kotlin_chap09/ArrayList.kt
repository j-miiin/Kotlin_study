package chap09.section2

import java.util.*

fun main() {
    val stringList: ArrayList<String> = arrayListOf<String>("Hello", "Kotlin", "Wow")
    stringList.add("Java")
    stringList.remove("Hello")
    stringList[0] = "Sean"
    println(stringList)
}