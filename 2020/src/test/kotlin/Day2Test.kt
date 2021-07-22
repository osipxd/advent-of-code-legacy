import kotlin.test.Test
import kotlin.test.assertEquals

class Day2Test {

    private val example: Sequence<Pair<Day2.Policy, String>>
        get() = sequenceOf(
            "1-3 a: abcde",
            "1-3 b: cdefg",
            "2-9 c: ccccccccc",
        ).map(Day2::parsePolicyAndPassword)

    private val input: Sequence<Pair<Day2.Policy, String>>
        get() = readLineSequence("day2.txt")
            .map(Day2::parsePolicyAndPassword)

    @Test
    fun `part1 - example`() {
        assertEquals(expected = 2, actual = Day2.part1(example))
    }

    @Test
    fun `part1 - input`() {
        assertEquals(expected = 542, actual = Day2.part1(input))
    }

    @Test
    fun `part2 - example`() {
        assertEquals(expected = 1, actual = Day2.part2(example))
    }

    @Test
    fun `part2 - input`() {
        assertEquals(expected = 360, actual = Day2.part2(input))
    }
}
