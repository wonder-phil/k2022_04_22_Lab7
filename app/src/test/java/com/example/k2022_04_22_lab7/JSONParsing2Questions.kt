package com.example.k2022_04_22_lab7

import com.google.gson.Gson
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class JSONParsing2Questions {

    @Test
    fun basic_gson_object() {

        var gson: Gson = Gson()

        var tinyString: String = "{ first :1,  second: 2 }"

        class TinyC {
            var  first: Int = 0
            var  second: Int = 0

            fun getSum(): Int {
                return first+ second
            }
        }

        var tinyC: TinyC = gson.fromJson(tinyString, TinyC::class.java)

        assertEquals(3, tinyC.getSum())
    }

    @Test
    fun basic_gson_array() {

        var gson: Gson = Gson()

        var tinyStringArray: String = "[ { first :1 , second: 2 }, { first :5 , second: 7 } ]"
        var sums: List<Int> = listOf(3,12)

        class TinyC {
            var  first: Int = 0
            var  second: Int = 0

            fun getSum(): Int {
                return first+ second
            }
        }

        var tinyC_array: List<TinyC> = gson.fromJson(tinyStringArray, Array<TinyC>::class.java).toList()

        var i: Int = 0
        for (tinyC in tinyC_array) {
            assertEquals(tinyC.getSum(), sums[i])
            i += 1
        }

    }



    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}