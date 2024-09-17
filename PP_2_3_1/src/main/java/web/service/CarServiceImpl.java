package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService{

    @Override
    public List<Car> getlistCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Mazda", 3, "blue"));
        cars.add(new Car("Opel", 6, "white"));
        cars.add(new Car("BMW", 10, "black"));
        cars.add(new Car("Lada", 15, "green"));
        cars.add(new Car("Mazda", 5, "red"));
        return cars;
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        if (count <= 0 || count > 5) return getlistCars();
        return getlistCars().stream().limit(count).collect(Collectors.toList());
    }
}
