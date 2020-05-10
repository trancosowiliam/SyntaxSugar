package com.example.syntaxsugar.intended

import android.content.Context

interface SimpleIntended {
    operator fun invoke(context: Context)
}