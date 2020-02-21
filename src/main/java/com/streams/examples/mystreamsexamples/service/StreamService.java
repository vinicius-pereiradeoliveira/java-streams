package com.streams.examples.mystreamsexamples.service;

import com.streams.examples.mystreamsexamples.beans.Person;
import com.streams.examples.mystreamsexamples.mocks.PersonMock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StreamService {

    @Autowired
    private PersonMock personMock;

    //create list of persons with more 30 years - imperative mode
    public void showListPersonsImperative(){
        List<Person> people = personMock.findPerson();
        List<Person> peopleMore30 = new ArrayList<>();

        for(Person person:people){
            if(person.getAge() > 30){
                peopleMore30.add(person);
            }
        }

        for (Person person:peopleMore30){
            System.out.println(person.getFirstName()+" - "+person.getAge());
        }
    }

    //create list of persons with more 30 years - functional mode
    public void showListPersonsFunctional(){

    }
}
