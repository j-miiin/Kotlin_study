package chap10.section1

import java.io.File
import java.io.FileOutputStream
import java.io.PrintWriter

fun main() {
    val file = File("d:\\test\\contents.txt")
    file.bufferedReader().use {
        println(it.readText())
    }
    PrintWriter(FileOutputStream("d:\\test\\output.txt")).use {
        it.println("hello")
    }
}

