package fr.baldir.adhdstash.domain

import java.util.*
import kotlin.collections.ArrayDeque

class Stash {

    private val stack = ArrayDeque<String>()

    fun isEmpty(): Boolean {
        return this.stack.isEmpty()
    }

    fun stash(element: String) {
        this.stack.addFirst(element)
    }

    fun unstash(): String {
        return this.stack.removeFirst()
    }

    /**
     * Persistence related companion object to keep the domain pure.
     */
    companion object Persistence{

        fun fromString(string:String):Stash{
            val stash = Stash()
            string.split("|||")
                .reversed()
                .forEach{stash.stash(it)}
            return stash
        }

        fun Stash.toPersistFormat():String{
            return stack.joinToString(separator = "|||")
        }
    }
}
