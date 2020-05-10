package com.example.syntaxsugar.intended

import android.content.Context
import android.content.Intent

typealias IntentFactory = Intent.() -> Intent


interface Intended<T> {
    val cls: Class<*>

    fun createBundle(t: T): IntentFactory

    operator fun invoke(context: Context, t: T) {
        context.startActivity(createBundle(t)(Intent(context, cls)))
    }
}
