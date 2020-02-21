package com.streams.examples.mystreamsexamples.beans;

public class PersonDTO {
    private final Integer id;
    private final String name;
    private final Integer age;

    public PersonDTO(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
