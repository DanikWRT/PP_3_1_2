package ru.pogodindv.PP_3_1_2.dao;



import ru.pogodindv.PP_3_1_2.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> getCarByNumber(int number);
}