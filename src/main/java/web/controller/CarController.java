package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;


import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String car(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Audi", "RS7", 2013));
        carList.add(new Car("BMW", "M5", 2014));
        carList.add(new Car("Mercedes", "G63", 2015));
        carList.add(new Car("Volkswagen", "Touareg", 2016));
        carList.add(new Car("Volvo", "XC90", 2017));
        carList = CarService.carsCount(carList, allCars);
        model.addAttribute("carList", carList);
        return "cars";
    }
}
