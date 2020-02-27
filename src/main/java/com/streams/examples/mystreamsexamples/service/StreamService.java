package com.streams.examples.mystreamsexamples.service;

import com.streams.examples.mystreamsexamples.beans.Car;
import com.streams.examples.mystreamsexamples.beans.Person;
import com.streams.examples.mystreamsexamples.beans.PersonDTO;
import com.streams.examples.mystreamsexamples.mocks.CarMock;
import com.streams.examples.mystreamsexamples.mocks.NumberListMock;
import com.streams.examples.mystreamsexamples.mocks.PersonMock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class StreamService {

    @Autowired
    private PersonMock personMock;
    @Autowired
    private NumberListMock numberListMock;
    @Autowired
    private CarMock carMock;

    //create list of persons with more 30 years - imperative mode
    public List<Person> showListPersonsImperative(){
        long start = System.currentTimeMillis();
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

        long elapsed = System.currentTimeMillis() - start / 1000;;
        System.out.println("Imperative Execute in: " + elapsed);
        return peopleMore30;
    }

    //create list of persons with more 30 years - benchmark functional mode
    public List<Person> showListPersonsFunctionalBench(){
        long start = System.currentTimeMillis();

        List<Person> people =  personMock.findPerson().stream()
                .filter(person -> person.getAge() > 30)
                .collect(Collectors.toList());

        long elapsed = System.currentTimeMillis() - start / 1000;
        System.out.println("Functional Execute in: " + elapsed);
        return people;
    }

    //create list of persons with more 30 years - no-benchmark functional mode
    public List<Person> showListPersonsFunctional(){
        return  personMock.findPerson().stream()
                .filter(person -> person.getAge() > 30)
                .collect(Collectors.toList());
    }

    // Simple iterate 1 to 100000 for test - imperative mode
    public String showIterateImperative(){
        for (int i = 0; i <= 100000; i++){
            if(i == 956 || i == 99000){
                System.out.println("Any Number for test of process "+i);
            }
        }
        return "Test Done!";
    }

    // Simple iterate 1 to 100000 for test - functional mode
    public String showIterateFunctional(){
        IntStream.rangeClosed(1,100000).forEach(pair -> {
            if(pair == 956 || pair == 99000){
                System.out.println("Any Number for test of process "+pair);
            }
        });

        // OR...

        // In this case, exclude the last int number. Will print 1 to 9, and exclude 10.
        IntStream.range(1,10).forEach(System.out::println);
        // In this case, include the last int number. Will print 1 to 10.
        IntStream.rangeClosed(1,10).forEach(System.out::println);

        return "Test Done!";
    }

    public void rangeIteratingLists(){
        List<Person> people =  personMock.findPerson();

        // In this code, exist a iteration for the lists of Person Object. We use a range 0 to size of list and print each Object.
        IntStream.range(0,people.size())
                .forEach(index -> {
                    Person person = people.get(index);
                    System.out.println(person);
                });
    }

    public void removingDuplicateData(){
        System.out.println("Removing duplicate Data - Create new List with exclusive numbers");
        List<Integer> numbersList = numberListMock.createNumbers();

        // Use here Java Streams
        List<Integer> distinctNumbers = numbersList.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctNumbers);
        System.out.println();
    }

    public void filteringData(){
        System.out.println("Filtering Data - Only cars with price more than 30000.00");
        List<Car> cars = carMock.findCars();

        // Use here Java Streams
        List<Car> listFiltered = cars.stream()
                .filter(car -> car.getPrice() > 30000.00)
                .collect(Collectors.toList());
        listFiltered.forEach(System.out::println);

        System.out.println();
    }

    public void transformObjectToDTO(){
        System.out.println("Transforming Data - Class Person to PersonDTO");
        List<Person> people = personMock.findPerson();

        // Use here Java Streams
        List<PersonDTO> dtos = people.stream()
                .map(person -> new PersonDTO(person.getId(),person.getFirstName(),person.getAge()))
                .collect(Collectors.toList());

        dtos.forEach(System.out::println);
        System.out.println();
    }

    public void groupingDataLikeSql(){
        System.out.println("Grouping Data - Use Class Car and grouping the data");
        List<Car> cars = carMock.findCars();

        // Use here Java Streams
        cars.stream().collect(Collectors.groupingBy(Car::getPrice));
        cars.forEach(System.out::println);

        System.out.println();
    }
}
