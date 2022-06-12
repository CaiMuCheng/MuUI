package com.mucheng.ui.Core

object Selector {

    private val box: MutableMap<String, Any?> = HashMap()

    internal fun has(key: String): Boolean {
        return box.containsKey(key)
    }

    internal fun put(key: String, value: Any?) {
        box[key] = value
    }

    operator fun get(key: String): Any? {
        return box[key]
    }

    fun clear() {
        box.clear()
    }

}