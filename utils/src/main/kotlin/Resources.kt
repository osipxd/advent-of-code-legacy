import Resources.getResourceAsStream
import java.io.InputStream

fun readLines(name: String): List<String> {
    return getResourceAsStream(name)
        .bufferedReader()
        .readLines()
}

fun readNumbers(name: String): List<Int> {
    return readLines(name).map { it.toInt() }
}

private object Resources {
    fun getResourceAsStream(name: String): InputStream = javaClass.getResourceAsStream(name)!!
}
