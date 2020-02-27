package com.streams.examples.mystreamsexamples.mocks;

import com.streams.examples.mystreamsexamples.beans.Car;
import com.streams.examples.mystreamsexamples.beans.Person;
import org.springframework.stereotype.Component;
import sun.util.resources.ext.CurrencyNames_ar_YE;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarMock {

    public List<Car> findCars(){
        List<Car> cars = new ArrayList<>();

        cars.add(new Car(1,"Tesla","black",2018,37000.00));
        cars.add(new Car(2,"Golf","blue",2018,28000.00));
        cars.add(new Car(3,"X5","gray",2019,34000.00));
        cars.add(new Car(4,"Yaris","white",2018,12000.00));
        cars.add(new Car(5,"Tesla","white",2017,33000.00));

        return cars;
    }

}
