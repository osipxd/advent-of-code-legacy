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
        get() = readText("day6.txt")

    @Test
    fun `part1 - example`() {
        assertEquals(11, Day6.part1(example))
    }

    @Test
    fun `part1 - input`() {
        assertEquals(6703, Day6.part1(input))
    }
}
