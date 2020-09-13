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
    //FIXME : this is persistence concern, should be moved outside core domain
    fun toPersistFormat():String{
        return stack.joinToString(separator = "|||")
    }
}
