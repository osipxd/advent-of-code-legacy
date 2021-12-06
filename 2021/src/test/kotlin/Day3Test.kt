import kotlin.test.Test
import kotlin.test.assertEquals

internal class Day3Test {

    private val example: List<String>
        get() = listOf(
            "00100",
            "11110",
            "10110",
            "10111",
            "10101",
            "01111",
            "00111",
            "11100",
            "10000",
            "11001",
            "00010",
            "01010",
        )

    private val input: List<String>
        get() = readLines("day3.txt")

    @Test
    fun `part1 - example`() {
        assertEquals(expected = 198, actual = Day3.part1(example))
    }

    @Test
    fun `part1 - input`() {
        assertEquals(expected = 3958484, actual = Day3.part1(input))
    }

//    @Test
//    fun `part2 - example`() {
//        assertEquals(expected = 900, actual = Day3.part2(example))
//    }
//
//    @Test
//    fun `part2 - input`() {
//        assertEquals(expected = 1320534480, actual = Day3.part2(input))
//    }
}
