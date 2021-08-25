/**
 * # Day 7: Handy Haversacks
 *
 * You land at the regional airport in time for your next flight. In fact, it
 * looks like you'll even have time to grab some food: all flights are
 * currently delayed due to **issues in luggage processing**.
 *
 * Due to recent aviation regulations, many rules (your puzzle input) are
 * being enforced about bags and their contents; bags must be color-coded and
 * must contain specific quantities of other color-coded bags. Apparently,
 * nobody responsible for these regulations considered how long they would
 * take to enforce!
 *
 * For example, consider the following rules:
 * ```
 * light red bags contain 1 bright white bag, 2 muted yellow bags.
 * dark orange bags contain 3 bright white bags, 4 muted yellow bags.
 * bright white bags contain 1 shiny gold bag.
 * muted yellow bags contain 2 shiny gold bags, 9 faded blue bags.
 * shiny gold bags contain 1 dark olive bag, 2 vibrant plum bags.
 * dark olive bags contain 3 faded blue bags, 4 dotted black bags.
 * vibrant plum bags contain 5 faded blue bags, 6 dotted black bags.
 * faded blue bags contain no other bags.
 * dotted black bags contain no other bags.
 * ```
 *
 * These rules specify the required contents for 9 bag types. In this example,
 * every `faded blue` bag is empty, every vibrant `plum bag` contains 11 bags
 * (5 `faded blue` and 6 `dotted black`), and so on.
 *
 * You have a `shiny gold` bag. If you wanted to carry it in at least one other
 * bag, how many different bag colors would be valid for the outermost bag?
 * (In other words: how many colors can, eventually, contain at least one
 * `shiny gold` bag?)
 *
 * In the above rules, the following options would be available to you:
 *
 * - A `bright white` bag, which can hold your `shiny gold` bag directly.
 * - A `muted yellow` bag, which can hold your `shiny gold` bag directly,
 *   plus some other bags.
 * - A `dark orange` bag, which can hold `bright white` and `muted yellow` bags,
 *   either of which could then hold your `shiny gold` bag.
 * - A `light red` bag, which can hold `bright white` and `muted yellow` bags,
 *   either of which could then hold your `shiny gold` bag.
 *
 * So, in this example, the number of bag colors that can eventually contain
 * at least one `shiny gold` bag is **4**.
 *
 * **How many bag colors can eventually contain at least one `shiny gold` bag?**
 * (The list of rules is quite long; make sure you get all of it.)
 *
 * --- Part Two ---
 *
 * It's getting pretty expensive to fly these days - not because of ticket prices,
 * but because of the ridiculous number of bags you need to buy!
 *
 * Consider again your shiny gold bag and the rules from the above example:
 * ```
 * faded blue bags contain 0 other bags.
 * dotted black bags contain 0 other bags.
 * vibrant plum bags contain 11 other bags: 5 faded blue bags and 6 dotted black bags.
 * dark olive bags contain 7 other bags: 3 faded blue bags and 4 dotted black bags.
 * ```
 *
 * So, a single shiny gold bag must contain 1 dark olive bag (and the 7 bags
 * within it) plus 2 vibrant plum bags (and the 11 bags within each of those):
 * `1 + 1*7 + 2 + 2*11 = 32` bags!
 *
 * Of course, the actual rules have a small chance of going several levels deeper than this example; be sure to count all of the bags, even if the nesting becomes topologically impractical!
 *
 * Here's another example:
 * ```
 * shiny gold bags contain 2 dark red bags.
 * dark red bags contain 2 dark orange bags.
 * dark orange bags contain 2 dark yellow bags.
 * dark yellow bags contain 2 dark green bags.
 * dark green bags contain 2 dark blue bags.
 * dark blue bags contain 2 dark violet bags.
 * dark violet bags contain no other bags.
 * ```
 *
 * In this example, a single shiny gold bag must contain 126 other bags.
 *
 * How many individual bags are required inside your single shiny gold bag?
 *
 * *[Open in browser](https://adventofcode.com/2020/day/7)*
 */
object Day7 {

    // clear lavender bags contain 4 vibrant black bags, 2 posh red bags.
    private const val BAG_NAME = "[a-z]+ [a-z]+"
    private val bagNameRegex = Regex("^$BAG_NAME")
    private val bagContentRegex = Regex("(\\d) ($BAG_NAME) bag")

    fun part1(rules: Sequence<String>): Int {
        val bagsTree = mutableMapOf<String, MutableSet<String>>()
        rules.forEach { rule ->
            val bagName = bagNameRegex.first(rule).value
            val bagContent = bagContentRegex.findAll(rule).map { it.groupValues[2] }
            for (childBagName in bagContent) {
                bagsTree.getOrPut(childBagName) { mutableSetOf() }
                    .add(bagName)
            }
        }

        return bagsTree.getAllContainers("shiny gold").size
    }

    private fun Map<String, Set<String>>.getAllContainers(bagName: String): Set<String> {
        if (bagName !in this) return emptySet()

        val content = getValue(bagName)
        return content + content.flatMap { getAllContainers(it) }
    }

    fun part2(rules: Sequence<String>): Int {
        val bagsTree = rules.associate { rule ->
            val bagName = bagNameRegex.first(rule).value
            val bagContent = bagContentRegex.findAll(rule).mapTo(mutableSetOf()) {
                InnerBag(
                    name = it.groupValues[2],
                    count = it.groupValues[1].toInt()
                )
            }
            bagName to bagContent
        }

        return bagsTree.countContentOf("shiny gold")
    }

    private fun Map<String, Set<InnerBag>>.countContentOf(bagName: String): Int {
        val content = getValue(bagName)
        return content.sumOf { (name, count) -> count + count * countContentOf(name) }
    }

    private fun Regex.first(input: String): MatchResult = checkNotNull(find(input))

    private data class InnerBag(val name: String, val count: Int)
}
