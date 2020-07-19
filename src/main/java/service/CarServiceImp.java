package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService {
    public List<Car> getAllCars() {
        List<Car> carList = new ArrayList<Car>();

        carList.add(new Car("AUDI", 10000, 234));
        carList.add(new Car("OPEL", 7000, 195));
        carList.add(new Car("HONDA", 5000, 220));
        return carList;
    }
}
