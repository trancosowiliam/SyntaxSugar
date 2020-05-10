# SyntaxSugar


        fun issoBasta(context: Context, person: Person) {
            val intent = Intent(context, PersonActivity::class.java)

            intent.putExtra(EXTRA_NAME, person.name)
            intent.putExtra(EXTRA_AGE, person.age)

            context.startActivity(intent)
        }
