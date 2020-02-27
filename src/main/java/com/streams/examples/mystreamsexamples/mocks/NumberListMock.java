package com.streams.examples.mystreamsexamples.mocks;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class NumberListMock {
    public List<Integer> createNumbers(){
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(4);
        numbersList.add(5);
        numbersList.add(6);
        numbersList.add(7);
        numbersList.add(8);
        numbersList.add(9);
        numbersList.add(9);
        numbersList.add(10);
        return numbersList;
    }
}
