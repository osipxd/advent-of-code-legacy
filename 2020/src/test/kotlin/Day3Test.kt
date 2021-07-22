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

    private fun List<String>.toArray2D() = this.map { it.toCharArray() }.toTypedArray()
}
