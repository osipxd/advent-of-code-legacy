import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class Day5Test {

    private val example: List<String> = listOf(
        "BFFFBBFRRR",
        "FFFBBBFRRR",
        "BBFFBBFRLL",
    )

    private val input: List<String>
        get() = readLines("day5.txt")

    @Test
    fun `part1 - example`() {
        assertEquals(820, Day5.part1(example))
    }

    @Test
    fun `part1 - input`() {
        assertEquals(871, Day5.part1(input))
    }

    @Test
    fun `part2Naive - input`() {
        assertEquals(640, Day5.part2Naive(input))
    }

    @Test
    fun `part2Optimized - input`() {
        assertEquals(640, Day5.part2Optimized(input))
    }
}
