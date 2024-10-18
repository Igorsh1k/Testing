package edu.cs.lab4crud.service;

/*
  @author   AlexAT
  @project   lab4-crud
  @class  MealService
  @version  1.0.0
  @since 30.09.2024 - 22.59
*/

import edu.cs.lab4crud.model.Car;
import edu.cs.lab4crud.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {
    private final CarRepository carRepository;

    public List<Car> getAll() {
        return carRepository.findAll();
    }

    public Car getById(String id) {
        return carRepository.findById(id).orElse(null);
    }

    public Car create(Car car) {
        return carRepository.save(car);
    }

    public Car update(Car car) {
        return carRepository.save(car);
    }

    public void delById(String id) {
        carRepository.deleteById(id);
    }
}