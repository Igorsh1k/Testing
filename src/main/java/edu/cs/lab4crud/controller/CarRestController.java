package edu.cs.lab4crud.controller;

/*
  @author   ShurhaliukIhor
  @project   lab4
  @class  MealRestController
  @version  1.0.0
  @since 4.10.2024 - 20.50
*/

import edu.cs.lab4crud.model.Car;
import edu.cs.lab4crud.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/cars/")
@RequiredArgsConstructor
public class CarRestController {
    private final CarService carService;

    @GetMapping
    public List<Car> getAll() {
        return carService.getAll();
    }

    @GetMapping("{id}")
    public Car showOneById(@PathVariable String id) {
        return carService.getById(id);
    }

    @PostMapping
    public Car insert(@RequestBody Car car) {
        return carService.create(car);
    }

    @PutMapping
    public Car edit(@RequestBody Car car) {
        return carService.update(car);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        carService.delById(id);
    }
}
