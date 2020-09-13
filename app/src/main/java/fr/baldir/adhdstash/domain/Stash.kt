package fr.baldir.adhdstash.domain

import java.util.*

class Stash {

    private val stack = Stack<String>()

    fun isEmpty(): Boolean {
        return this.stack.isEmpty()
    }

    fun stash(element: String) {
        this.stack.push(element)
    }

    fun unstash(): String {
        return this.stack.pop()
    }
}