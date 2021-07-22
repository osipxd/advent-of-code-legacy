/**
 * # Day 1: Report Repair
 *
 * The Elves in accounting just need you to fix your **expense report** (your puzzle input); apparently,
 * something isn't quite adding up. Specifically, they need you to find the two entries that sum to 2020
 * and then multiply those two numbers together.
 *
 * For example, suppose your expense report contained the following:
 * ```
 * 1721
 * 979
 * 366
 * 299
 * 675
 * 1456
 * ```
 *
 * In this list, the two entries that sum to `2020` are `1721` and `299`. Multiplying them together produces
 * `1721 * 299 = 514579`, so the correct answer is `514579`.
 *
 * Of course, your expense report is much larger. **Find the two entries that sum to 2020; what do you get
 * if you multiply them together?**
 *
 * *[Open in browser](https://adventofcode.com/2020/day/1)*
 */
object Day1 {

    // Complexity: O(n^2)
    fun part1Naive(expenseReport: List<Int>): Int {
        for (a in expenseReport) {
            for (b in expenseReport) {
                if (a + b == 2020) {
                    return (a * b).also { println("$a * $b = $it") }
                }
            }
        }

        error("What? There no answer?")
    }
}
