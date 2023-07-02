package web.service;

import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    public List<Car> giveCarsByNumbers(Integer count) {
        List<Car> carList = CarDaoImpl.getCarList();
        if (count >= 5) {
            return carList;
        }
        if (count < 0) {
            return carList.subList(0, 0);
        }
        return carList.subList(0, count);
    }
}
