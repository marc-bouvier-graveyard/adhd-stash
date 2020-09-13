package fr.baldir.adhdstash.domain

import java.util.*

class Stash<M> {

    private val stack = Stack<M>()

    fun isEmpty(): Boolean {
        return this.stack.isEmpty()
    }

    fun stash(element: M) {
        this.stack.push(element)
    }

    fun unstash(): M {
        return this.stack.pop()
    }
}