package by.javaguru;

import by.javaguru.dao.CarDao;

import java.util.Optional;

public class CarService {
    private final CarDao userDao = new CarDao();

    public Optional<CarDto> getCar(Long id) {
        return userDao.findbyId(id).map(it -> new CarDto(it.getBrandOfCar(), it.getPrice(),  it.getMaxSpeed()));
    }
}
