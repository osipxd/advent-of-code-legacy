import kotlin.test.Test
import kotlin.test.assertEquals

class Day6Test {

    private val example: String = """
        abc
        
        a
        b
        c
        
        ab
        ac
        
        a
        a
        a
        a
        
        b
    """.trimIndent()

    private val input: String
        get() = readText("day6.txt").trim()

    @Test
    fun `part1 - example`() {
        assertEquals(11, Day6.part1(example))
    }

    @Test
    fun `part1 - input`() {
        assertEquals(6703, Day6.part1(input))
    }

    @Test
    fun `part2HashMapCount - example`() {
        assertEquals(6, Day6.part2HashMapCount(example))
    }

    @Test
    fun `part2HashMapCount - input`() {
        assertEquals(3430, Day6.part2HashMapCount(input))
    }

    @Test
    fun `part2SetIntersect - example`() {
        assertEquals(6, Day6.part2SetIntersect(example))
    }

    @Test
    fun `part2SetIntersect - input`() {
        assertEquals(3430, Day6.part2SetIntersect(input))
    }

    @Test
    fun `part2StringIntersect - example`() {
        assertEquals(6, Day6.part2StringIntersect(example))
    }

    @Test
    fun `part2StringIntersect - input`() {
        assertEquals(3430, Day6.part2StringIntersect(input))
    }
}
