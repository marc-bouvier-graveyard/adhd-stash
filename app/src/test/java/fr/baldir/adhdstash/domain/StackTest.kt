package fr.baldir.adhdstash.domain

import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.*

class StackTest {

    @Test
    fun a_new_stash_is_empty() {
        assertEquals(0, Stack<String>().size)
    }

    @Test
    fun when_an_element_is_stashed_the_same_is_popped() {
        val stash = Stack<String>()
        stash.push("I was writing a test with TDD")
        val actual = stash.pop()
        assertEquals("I was writing a test with TDD", actual)
    }
}