import kotlin.test.Test
import kotlin.test.assertEquals

internal class Day1Test {

    private val example: List<Int>
        get() = listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)

    private val input: List<Int>
        get() = readNumbers("day1.txt")

    @Test
    fun `part1 - example`() {
        assertEquals(expected = 7, actual = Day1.part1(example))
    }

    @Test
    fun `part1 - input`() {
        assertEquals(expected = 1195, actual = Day1.part1(input))
    }
}
