package edu.cs.lab4crud.repository;

/*
  @author   ShurhaliukIhor
  @project   lab4
  @class  MealRepository
  @version  1.0.0
  @since 4.10.2024 - 22.02
*/

import edu.cs.lab4crud.model.Car;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends MongoRepository<Car, String> {
}