import kotlin.test.Test
import kotlin.test.assertEquals

class Day1Test {

    private val exampleExpenseReport = listOf(
        1721,
        979,
        366,
        299,
        675,
        1456,
    )

    @Test
    fun `part1Naive - expense report from example`() {
        // Given
        val expenseReport = exampleExpenseReport

        // Expect
        assertEquals(expected = 514579, actual = Day1.part1Naive(expenseReport))
    }

    @Test
    fun `part1Naive - expense report from input`() {
        // Given
        val expenseReport = readNumbers("day1.txt")

        // Then
        assertEquals(expected = 858496, actual = Day1.part1Naive(expenseReport))
    }
}
