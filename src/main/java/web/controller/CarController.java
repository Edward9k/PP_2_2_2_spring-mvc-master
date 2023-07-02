package web.controller;

import web.dao.CarDaoImpl;
import web.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public static String getCarsPage(ModelMap model, Integer count) {
        CarService carService = new CarServiceImpl();

        List<Car> carsList;
        if (count != null) {
            carsList = carService.giveCarsByNumbers(count.intValue());
        } else {
            carsList = CarDaoImpl.getCarList();
        }

        model.addAttribute("messages", carsList);
        return "cars";
    }
}

