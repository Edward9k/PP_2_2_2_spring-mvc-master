package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl {
    public static List<Car> getCarList() {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("ВАЗ-2107", "Жигули коробка автомат, заниженный, слышишь, пятиступка! " +
                "«Семёрка» с внешностью «Пятёрки»", 390000));
        carsList.add(new Car("ВАЗ-2105 VFTS", "Восточно-Финская Турбо Сверхзаряженная версия, " +
                "спортивная коробка, цвет черна-оранжевый.", 1210000));
        carsList.add(new Car("FERRARI-458 ITALIA", "Красный как помидор, 7 скоростей, аэродинамические каркасы, просто вах! " +
                "только разбить жалко.", 11361310));
        carsList.add(new Car(" Ford Mustang GT", "Ой, ой, ой, куда гонится? Тайсон чтоли вышел!? " +
                "10-ступенчатый автомат! Ну что, друзья, ощущаете адреналин?", 5970000));
        carsList.add(new Car("Chevrolet Camaro SS", "Это просто мечта гопника! Двигатель V8, огромная мощность, " +
                "и коробка передач - восьмиступенчатая, друзя!", 3500000));
        return carsList;
    }
}
