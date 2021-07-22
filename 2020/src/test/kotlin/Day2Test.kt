import kotlin.test.Test
import kotlin.test.assertEquals

class Day2Test {

    private val example: List<String>
        get() = listOf(
            "1-3 a: abcde",
            "1-3 b: cdefg",
            "2-9 c: ccccccccc",
        )

    private val input: List<String>
        get() = readLines("day2.txt")

    @Test
    fun `part1Naive - example`() {
        assertEquals(expected = 2, actual = Day2.part1Naive(example))
    }
}
