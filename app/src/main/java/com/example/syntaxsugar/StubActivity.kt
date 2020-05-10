package com.example.syntaxsugar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.syntaxsugar.intended.Intended
import com.example.syntaxsugar.intended.IntentFactory

class StubActivity : AppCompatActivity() {

    companion object : Intended<String> {

        override val cls = StubActivity::class.java

        override fun createBundle(t: String): IntentFactory {
            return {
                this.putExtra("EXTRA", t)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stub)

    }
}
