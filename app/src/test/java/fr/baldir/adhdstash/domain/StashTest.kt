package fr.baldir.adhdstash.domain

import fr.baldir.adhdstash.domain.Stash.Persistence.toPersistFormat
import org.junit.Assert.assertEquals
import org.junit.Test

class StashTest {

    // Appui sur stash
    //   - alt : saisie de texte
    //   - alt : maintien appui, dire le message. puis relacher
    //   - alt : Dire "Stash" : puis dire le message, fin du message à détection du silence
    // Appui sur unstash
    // - alt : affichage du message
    // - alt : écoute du message
    // Appui sur clear
    // - remize à zéro

    @Test
    fun a_new_stash_is_empty() {
        assertEquals(true, Stash().isEmpty())
    }

    @Test
    fun when_an_element_is_stashed_the_same_is_popped() {
        val stash = Stash()
        stash.stash("I was writing a test with TDD")
        val actual = stash.unstash()
        assertEquals("I was writing a test with TDD", actual)
    }

    @Test
    fun serialization_to_string() {
        val stash = Stash()
        stash.stash("1")
        stash.stash("2")
        assertEquals("2|||1", stash.toPersistFormat())
    }

    @Test
    fun deserialization_from_string() {
        val stash: Stash = Stash.Persistence.fromString("2|||1")
        val actual2 = stash.unstash()
        val actual1 = stash.unstash()
        assertEquals("2", actual2)
        assertEquals("1", actual1)
    }
}