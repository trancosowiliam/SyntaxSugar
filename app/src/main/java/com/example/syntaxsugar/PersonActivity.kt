package com.example.syntaxsugar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.syntaxsugar.intended.Intended
import com.example.syntaxsugar.intended.IntentFactory

class PersonActivity : AppCompatActivity() {

    companion object : Intended<Person> {
        private const val EXTRA_NAME = "name"
        private const val EXTRA_AGE = "age"

        override val cls = PersonActivity::class.java

        override fun createBundle(person: Person): IntentFactory {
            return {
                putExtra(EXTRA_NAME, person.name)
                putExtra(EXTRA_AGE, person.age)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_person)

        val name = intent.getStringExtra(EXTRA_NAME)
        StubActivity(this, name)
    }
}
