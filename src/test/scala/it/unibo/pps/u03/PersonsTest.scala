package it.unibo.pps.u03

import it.unibo.pps.u03.Persons.*
import it.unibo.pps.u03.Persons.Person.*
import org.junit.*
import org.junit.Assert.*
import u03.Sequences.Sequence
import u03.Sequences.Sequence.{Cons, Nil}

class PersonsTest:

    @Test def testTeacherList() =
        val sequence: Sequence[Person] = Cons(Person.Teacher("Viroli", "PPS"), Cons(Person.Student("Federico", 2022), Cons(Person.Teacher("Ricci", "PCD"), Nil())))
        val result: Sequence[String] = Cons("PPS", Cons("PCD", Nil()))
        assertEquals(result, teachers(sequence))