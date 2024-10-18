package edu.cs.lab4crud.model;

/*
  @author   ShurhaliukIhor
  @project   lab4
  @class  Meal
  @version  1.0.0
  @since 4.10.2024 - 21.20
*/

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Document
public class Car {
    private String id;
    private String make; // Виробник
    private String model; // Модель
    private int year; // Рік випуску
    private String color; // Колір
    private double price; // Ціна

    public Car(String make, String model, int year, String color, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
