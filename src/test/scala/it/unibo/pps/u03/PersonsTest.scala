package it.unibo.pps.u03

import it.unibo.pps.u03.Persons.*
import it.unibo.pps.u03.Persons.Person.*
import org.junit.*
import org.junit.Assert.*
import u03.Sequences.Sequence
import u03.Sequences.Sequence.{Cons, Nil}

class PersonsTest:
    val sequence: Sequence[Person] = Cons(Person.Teacher("Viroli", "PPS"), Cons(Person.Teacher("Aguzzi", "PPS"), Cons(Person.Teacher("Ricci", "PCD"), Nil())))
    @Test def testTeacherList() =
        val result: Sequence[String] = Cons("PPS", Cons("PCD", Nil()))
        assertEquals(result, courses(sequence))

    @Test def testDistinctCourses() =
        val result: Int = 2
        assertEquals(result, distinctCourses(sequence))