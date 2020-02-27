package com.streams.examples.mystreamsexamples.controller;

import com.streams.examples.mystreamsexamples.beans.Person;
import com.streams.examples.mystreamsexamples.service.StreamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/java")
public class PersonStreamsController {

    @Autowired
    private StreamService service;

    @GetMapping("/imperative")
    public List<Person> executeImperativeCode() throws Exception{
        return service.showListPersonsImperative();
    }

    @GetMapping("/functional")
    public List<Person> executeCodeStreams() throws Exception{
        return service.showListPersonsFunctional();
    }

    @GetMapping("/range-imperative")
    public String executeCodeRangeImperative() throws Exception{
        return service.showIterateImperative();
    }

    @GetMapping("/range-functional")
    public String executeCodeRangeFunctional() throws Exception{
        return service.showIterateFunctional();
    }

    @GetMapping("/range-lists")
    public String rangeIteratingLists() throws Exception{
        service.rangeIteratingLists();
        return "Test Done!";
    }
}
