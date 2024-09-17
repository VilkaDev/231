package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getlistCars();
    List<Car> getCarsByCount(int count);

}
