import kotlin.test.Test
import kotlin.test.assertEquals

internal class Day7Test {

    private val example: Sequence<String>
        get() = sequenceOf(
            "light red bags contain 1 bright white bag, 2 muted yellow bags.",
            "dark orange bags contain 3 bright white bags, 4 muted yellow bags.",
            "bright white bags contain 1 shiny gold bag.",
            "muted yellow bags contain 2 shiny gold bags, 9 faded blue bags.",
            "shiny gold bags contain 1 dark olive bag, 2 vibrant plum bags.",
            "dark olive bags contain 3 faded blue bags, 4 dotted black bags.",
            "vibrant plum bags contain 5 faded blue bags, 6 dotted black bags.",
            "faded blue bags contain no other bags.",
            "dotted black bags contain no other bags.",
        )

    private val input: Sequence<String>
        get() = readLineSequence("day7.txt")

    @Test
    fun `part1 - example`() {
        assertEquals(expected = 4, actual = Day7.part1(example))
    }

    @Test
    fun `part1 - input`() {
        assertEquals(expected = 224, actual = Day7.part1(input))
    }

    @Test
    fun `part2 - example`() {
        assertEquals(expected = 32, actual = Day7.part2(example))
    }

    @Test
    fun `part2 - input`() {
        assertEquals(expected = 1488, actual = Day7.part2(input))
    }
}
