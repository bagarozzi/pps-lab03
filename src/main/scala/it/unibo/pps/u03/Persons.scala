package it.unibo.pps.u03
import u03.Sequences.Sequence

object Persons:

    // introducing a new sum type , defined by enumerating various cases
    enum Person:
        case Student (name: String, year: Int)
        case Teacher (name: String, course: String)

    object Person:
        // an algorithm / manipulation over Person
        def name(p : Person): String = p match
            case Person.Student(n, _ ) => n
            case Person.Teacher(n, _ ) => n

        def teachers(s: Sequence[Person]): Sequence[String] = Sequence.flatMap(s) {
            case Teacher(n, c) => Sequence.Cons(c, Sequence.Nil())
            case _ => Sequence.Nil()
        }