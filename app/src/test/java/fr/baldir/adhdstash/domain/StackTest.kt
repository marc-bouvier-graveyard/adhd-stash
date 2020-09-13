package fr.baldir.adhdstash.domain

import junit.framework.Assert.assertEquals
import org.junit.Test
import java.util.*

class StackTest {

    @Test
    fun a_new_stack_is_empty(){
        assertEquals(Stack<String>().size,0)
    }
}