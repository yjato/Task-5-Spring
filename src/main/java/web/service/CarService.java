package web.service;
//Напиши метод, который будет возвращать указанное число машин из созданного списка.

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    public static List<Car> carsCount(List<Car> carList, int number) {
        if (number == 0 || number > 5){
            return carList ;
        }
        return carList.stream().limit(number).collect(Collectors.toList());
    }
}
