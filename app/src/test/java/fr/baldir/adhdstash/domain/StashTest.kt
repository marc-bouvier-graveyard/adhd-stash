package fr.baldir.adhdstash.domain

import org.junit.Assert.assertEquals
import org.junit.Test

class StashTest {

    @Test
    fun a_new_stash_is_empty() {
        assertEquals(true, Stash().isEmpty())
    }

    @Test
    fun when_an_element_is_stashed_the_same_is_popped() { val stash = Stash()
        stash.stash("I was writing a test with TDD")
        val actual = stash.unstash()
        assertEquals("I was writing a test with TDD", actual)
    }
}