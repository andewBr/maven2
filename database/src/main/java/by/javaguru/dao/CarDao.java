package by.javaguru.dao;

import by.javaguru.entity.Car;

import java.util.Optional;

public class CarDao {
    public Optional<Car> findbyId(Long id) {
        Car car = new Car();
        car.setBrandOfCar("BMW");
        car.setPrice(10000);
        car.setMaxSpeed(10);
        return Optional.of(car);
    }

}

