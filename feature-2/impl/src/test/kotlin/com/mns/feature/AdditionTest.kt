package com.mns.feature

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AdditionTest {
    @Test
    fun `Test one addition`() {
        val addition = Addition()
        assertEquals(5, addition.addition(2, 3))
    }

    @Test
    fun `Test two addition`() {
        val addition = Addition()
        assertEquals(5, addition.addition(2, 3))
    }

    @Test
    fun `Test three addition`() {
        val addition = Addition()
        assertEquals(5, addition.addition(2, 3))
    }

    @Test
    fun `Test four addition`() {
        val addition = Addition()
        assertEquals(5, addition.addition(2, 3))
    }
}