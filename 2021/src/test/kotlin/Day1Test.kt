import kotlin.test.Test
import kotlin.test.assertEquals

internal class Day1Test {

    private val example: Sequence<Int>
        get() = sequenceOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)

    private val input: Sequence<Int>
        get() = readNumbersSequence("day1.txt")

    @Test
    fun `part1 - example`() {
        assertEquals(expected = 7, actual = Day1.part1(example))
    }

    @Test
    fun `part1 - input`() {
        assertEquals(expected = 1195, actual = Day1.part1(input))
    }

    @Test
    fun `part2 - example`() {
        assertEquals(expected = 5, actual = Day1.part2(example))
    }

    @Test
    fun `part2 - input`() {
        assertEquals(expected = 1235, actual = Day1.part2(input))
    }
}
