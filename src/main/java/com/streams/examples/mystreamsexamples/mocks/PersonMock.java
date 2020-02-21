package com.streams.examples.mystreamsexamples.mocks;

import com.streams.examples.mystreamsexamples.beans.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonMock {

    public static List<Person> findPerson(){

        List<Person> persons = new ArrayList<>();

        Person person1 = new Person(1, "John","Connor","connor.lastday@gmail.com","M", 19);
        Person person2 = new Person(1, "Sara","Connor","sara.lastday@gmail.com","F", 55);
        Person person3 = new Person(1, "John","Malta","malta.lastday@gmail.com","M", 23);
        Person person4 = new Person(1, "Joana","Connor","joana.lastday@gmail.com","M", 40);
        Person person5 = new Person(1, "Jim","Connor","jim.lastday@gmail.com","M", 30);

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        return persons;
    }

}
