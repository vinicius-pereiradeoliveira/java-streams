package com.streams.examples.mystreamsexamples.beans;

public class Car {
    private final Integer id;
    private final String model;
    private final String color;
    private final Integer year;
    private final Double price;

    public Car(Integer id, String model, String color, Integer year, Double price) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Integer getYear() {
        return year;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
