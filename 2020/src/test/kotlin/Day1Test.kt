import kotlin.test.Test
import kotlin.test.assertEquals

class Day1Test {

    @Test
    fun `expense report from example`() {
        // Given
        val expenseReport = listOf(
            1721,
            979,
            366,
            299,
            675,
            1456,
        )

        // Expect
        assertEquals(expected = 514579, actual = Day1.task1(expenseReport))
    }

    @Test
    fun `print answer`() {
        // Given
        val expenseReport = readNumbers("day1.txt")

        // Then
        println("Answer: ${Day1.task1(expenseReport)}")
    }
}
