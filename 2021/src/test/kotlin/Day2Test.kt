import kotlin.test.Test
import kotlin.test.assertEquals

internal class Day2Test {

    private val example: Sequence<String>
        get() = sequenceOf(
            "forward 5",
            "down 5",
            "forward 8",
            "up 3",
            "down 8",
            "forward 2",
        )

    private val input: Sequence<String>
        get() = readLineSequence("day2.txt")

    @Test
    fun `part1 - example`() {
        assertEquals(expected = 150, actual = Day2.part1(example))
    }

    @Test
    fun `part1 - input`() {
        assertEquals(expected = 1459206, actual = Day2.part1(input))
    }

    @Test
    fun `part2 - example`() {
        assertEquals(expected = 900, actual = Day2.part2(example))
    }

    @Test
    fun `part2 - input`() {
        assertEquals(expected = 1320534480, actual = Day2.part2(input))
    }
}
