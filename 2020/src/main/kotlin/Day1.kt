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
 * --- Part Two ---
 *
 * The Elves in accounting are thankful for your help; one of them even offers you a starfish coin they had
 * left over from a past vacation. They offer you a second one if you can find **three** numbers in your
 * expense report that meet the same criteria.
 *
 * Using the above example again, the three entries that sum to `2020` are `979`, `366`, and `675`. Multiplying
 * them together produces the answer, `241861950`.
 *
 * In your expense report, **what is the product of the three entries that sum to `2020`?**
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

    // Complexity: O(n)
    fun part1Optimized(expenseReport: List<Int>): Int {
        val (a, b) = expenseReport.findPairForSum(2020) ?: error("Impossible.")
        return (a * b).also { println("$a * $b = $it") }
    }

    // Complexity: O(n^3)
    fun part2Naive(expenseReport: List<Int>): Int {
        for (a in expenseReport) {
            for (b in expenseReport) {
                for (c in expenseReport) {
                    if (a + b + c == 2020) {
                        return (a * b * c).also { println("$a * $b * $c = $it") }
                    }
                }
            }
        }

        error("What? There no answer?")
    }

    // Complexity: O(n^2)
    fun part2Optimized(expenseReport: List<Int>): Int {
        for (a in expenseReport) {
            val (b, c) = expenseReport.findPairForSum(2020 - a) ?: continue
            return (a * b * c).also { println("$a * $b * $c = $it") }
        }

        error("What? There no answer?")
    }

    private fun List<Int>.findPairForSum(sum: Int): Pair<Int, Int>? {
        val pairs = associateBy { sum - it }
        val first = find { it in pairs } ?: return null
        return first to pairs.getValue(first)
    }
}
