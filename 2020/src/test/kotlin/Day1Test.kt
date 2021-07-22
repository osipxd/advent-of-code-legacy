import kotlin.test.Test
import kotlin.test.assertEquals

class Day1Test {

    private val exampleExpenseReport: List<Int>
        get() = listOf(1721, 979, 366, 299, 675, 1456)

    private val inputExpenseReport: List<Int>
        get() = readNumbers("day1.txt")

    @Test
    fun `part1Naive - expense report from example`() {
        assertEquals(expected = 514579, actual = Day1.part1Naive(exampleExpenseReport))
    }

    @Test
    fun `part1Naive - expense report from input`() {
        assertEquals(expected = 858496, actual = Day1.part1Naive(inputExpenseReport))
    }

    @Test
    fun `part1Optimized - expense report from example`() {
        assertEquals(expected = 514579, actual = Day1.part1Optimized(exampleExpenseReport))
    }

    @Test
    fun `part1Optimized - expense report from input`() {
        assertEquals(expected = 858496, actual = Day1.part1Optimized(inputExpenseReport))
    }

    @Test
    fun `part2Naive - expense report from example`() {
        assertEquals(expected = 241861950, actual = Day1.part2Naive(exampleExpenseReport))
    }

    @Test
    fun `part2Naive - expense report from input`() {
        assertEquals(expected = 263819430, actual = Day1.part2Naive(inputExpenseReport))
    }
}
