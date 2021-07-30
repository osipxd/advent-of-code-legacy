import kotlin.test.Test
import kotlin.test.assertEquals

class Day4Test {

    private val example: Sequence<String>
        get() = """
            ecl:gry pid:860033327 eyr:2020 hcl:#fffffd
            byr:1937 iyr:2017 cid:147 hgt:183cm
            
            iyr:2013 ecl:amb cid:350 eyr:2023 pid:028048884
            hcl:#cfa07d byr:1929
            
            hcl:#ae17e1 iyr:2013
            eyr:2024
            ecl:brn pid:760753108 byr:1931
            hgt:179cm
            
            hcl:#cfa07d eyr:2025 pid:166559648
            iyr:2011 ecl:brn hgt:59in
        """.trimIndent().lineSequence()

    private val input: Sequence<String>
        get() = readLineSequence("day4.txt")

    @Test
    fun `part1 - example`() {
        assertEquals(expected = 2, actual = Day4.part1(example))
    }

    @Test
    fun `part1 - input`() {
        assertEquals(expected = 196, actual = Day4.part1(input))
    }
}
