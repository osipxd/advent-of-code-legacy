import Resources.getResourceAsStream
import java.io.InputStream

fun readLineSequence(name: String): Sequence<String> {
    return getResourceAsStream(name)
        .bufferedReader()
        .lineSequence()
}

fun readLines(name: String): List<String> {
    return getResourceAsStream(name)
        .bufferedReader()
        .readLines()
}

fun readText(name: String): String {
    return getResourceAsStream(name)
        .bufferedReader()
        .readText()
}

fun readNumbers(name: String): List<Int> {
    return readLines(name).map { it.toInt() }
}

private object Resources {
    fun getResourceAsStream(name: String): InputStream = javaClass.getResourceAsStream(name)!!
}
