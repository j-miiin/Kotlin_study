package chap10.section3

import java.io.*
import java.lang.Exception
import java.lang.StringBuilder

fun main() {
    val path = "C:\\김정민\\Kotlin\\Over the Rainbow.txt"

    /* 단순변환
    val file = File(path)
    val inputStream: InputStream = file.inputStream()
    val inputStreamReader = InputStreamReader(inputStream)
    val sb = StringBuilder()
    var line: String?
    val br = BufferedReader(inputStreamReader)
    try {
        line = br.readLine()
        while (line != null) {
            sb.append(line, '\n')
            line = br.readLine()
        }
        println(sb)
    } catch (e: Exception) {

    } finally {
        br.close()
    }
    */

    /*
    val file = File(path)
    val inputStream: InputStream = file.inputStream()
    val text = inputStream.bufferedReader().use { it.readText() }
    println(text)
    */

    val lineList = mutableListOf<String>()
    File(path).useLines { lines -> lines.forEach { lineList.add(it) } }
    lineList.forEach { println("> " + it) }
}
