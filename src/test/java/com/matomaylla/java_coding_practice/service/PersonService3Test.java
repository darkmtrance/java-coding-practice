package com.matomaylla.java_coding_practice.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {PersonService3.class})
@ExtendWith(SpringExtension.class)
class PersonService3Test {
    @Autowired
    private PersonService3 personService3;

    /**
     * Method under test: {@link PersonService3#getPersonDetailsBadPractice()}
     */
    @Test
    void testGetPersonDetailsBadPractice() {
        assertEquals("Name: John Doe, Age: 30", personService3.getPersonDetailsBadPractice());
    }

    /**
     * Method under test: {@link PersonService3#getPersonDetailsGoodPractice()}
     */
    @Test
    void testGetPersonDetailsGoodPractice() {
        assertEquals("Name: Jane Doe, Age: 25", personService3.getPersonDetailsGoodPractice());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PersonService3.Person#Person(String, int)}
     *   <li>{@link PersonService3.Person#getAge()}
     *   <li>{@link PersonService3.Person#getName()}
     * </ul>
     */
    @Test
    void testPersonConstructor() {
        PersonService3.Person actualPerson = new PersonService3.Person("Name", 1);
        int actualAge = actualPerson.getAge();
        assertEquals(1, actualAge);
        assertEquals("Name", actualPerson.getName());

        PersonService3.PersonRecord actualPersonRecord = new PersonService3.PersonRecord("Name2", 20);
        int actualAgeRecord = actualPersonRecord.age();
        assertEquals(20, actualAgeRecord);
        assertEquals("Name2", actualPersonRecord.name());
    }
}

