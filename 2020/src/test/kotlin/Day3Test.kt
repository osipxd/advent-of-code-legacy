import kotlin.test.Test
import kotlin.test.assertEquals

class Day3Test {

    private val example: Array2D
        get() = listOf(
            "..##.......",
            "#...#...#..",
            ".#....#..#.",
            "..#.#...#.#",
            ".#...##..#.",
            "..#.##.....",
            ".#.#.#....#",
            ".#........#",
            "#.##...#...",
            "#...##....#",
            ".#..#...#.#",
        ).toArray2D()

    private val input: Array2D
        get() = readLines("day3.txt").toArray2D()

    @Test
    fun `part1 - example`() {
        assertEquals(expected = 7, actual = Day3.part1(example))
    }

    @Test
    fun `part1 - input`() {
        assertEquals(expected = 195, actual = Day3.part1(input))
    }

    @Test
    fun `part2 - example`() {
        assertEquals(expected = 336, actual = Day3.part2(example))
    }

    @Test
    fun `part2 - input`() {
        assertEquals(expected = 3772314000, actual = Day3.part2(input))
    }

    private fun List<String>.toArray2D() = this.map { it.toCharArray() }.toTypedArray()
}
