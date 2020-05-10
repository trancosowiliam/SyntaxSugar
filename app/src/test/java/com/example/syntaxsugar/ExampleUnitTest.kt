package com.example.syntaxsugar

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {

        val meuValorTransformado: String = transformar(100) { x: Int ->
            x.toString()
        }

        assertEquals(4, 2 + 2)
    }


    fun transformar(number: Int, func: (Int) -> String): String {
        return func(number)
    }


}
