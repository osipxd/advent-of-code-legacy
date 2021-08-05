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

    @Test
    fun `part2 - invalid`() {
        val invalid = """
            eyr:1972 cid:100
            hcl:#18171d ecl:amb hgt:170 pid:186cm iyr:2018 byr:1926

            iyr:2019
            hcl:#602927 eyr:1967 hgt:170cm
            ecl:grn pid:012533040 byr:1946

            hcl:dab227 iyr:2012
            ecl:brn hgt:182cm pid:021572410 eyr:2020 byr:1992 cid:277

            hgt:59cm ecl:zzz
            eyr:2038 hcl:74454a iyr:2023
            pid:3556412378 byr:2007
        """.trimIndent().lineSequence()
        assertEquals(expected = 0, actual = Day4.part2(invalid))
    }

    @Test
    fun `part2 - valid`() {
        val invalid = """
            pid:087499704 hgt:74in ecl:grn iyr:2012 eyr:2030 byr:1980
            hcl:#623a2f
            
            eyr:2029 ecl:blu cid:129 byr:1989
            iyr:2014 pid:896056539 hcl:#a97842 hgt:165cm
            
            hcl:#888785
            hgt:164cm byr:2001 iyr:2015 cid:88
            pid:545766238 ecl:hzl
            eyr:2022
            
            iyr:2010 hgt:158cm hcl:#b6652a ecl:blu byr:1944 eyr:2021 pid:093154719
        """.trimIndent().lineSequence()
        assertEquals(expected = 4, actual = Day4.part2(invalid))
    }

    @Test
    fun `part2 - input`() {
        assertEquals(expected = 114, actual = Day4.part2(input))
    }

    @Test
    fun `part2 - valid fields`() {
        val data = mapOf(
            "byr" to "2002",
            "hgt" to "60in",
            "hgt" to "190cm",
            "hcl" to "#123abc",
            "ecl" to "brn",
            "pid" to "000000001",
        )
        assertEquals(expected = true, actual = Day4.validateFields(data))
    }

    @Test
    fun `part2 - invalid fields`() {
        val data = mapOf(
            "byr" to "2003",
            "hgt" to "190in",
            "hgt" to "190",
            "hcl" to "#123abz",
            "hcl" to "123abc",
            "ecl" to "wat",
            "pid" to "0123456789",
        )
        data.forEach { (key, value) ->
            assertEquals(expected = false, actual = Day4.validateFields(mapOf(key to value)))
        }
    }
}
