package carEx;

import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

//есть класс автомобиль, в котором есть три поля: марка, модель,цена.
//    // Написать метод, который принимает лист автомобилей, а возвращает Treemap,
//    // ключами которого являются марки автомобилей а значениями будут TreeSet
//   // автомобилей в котором автомобили расположены в лексикографическом порядке
//    // относительно модели, причем дешевые вперед если модели одинаковые
//    // auto1 -> Volvo, c60, 50000
//    // auto2 -> Mercedes, bmers600, 60000
//    // auto3 -> Mercedes, amers600, 40000
//    // auto4 -> Volvo, c60, 10000
//    //Mercedes - [auto3,auto2]
//    //Volvo - [auto4,auto1]
public class SortedCars {

    public TreeMap sortCars(List<Car> list) {
        TreeMap<String, TreeSet<Car>> map = new TreeMap<>();
        for (Car car : list) {
            if (map.containsKey(car.getBrand())) {
                map.get(car.getBrand()).add(car);
            } else {
                TreeSet<Car> value = new TreeSet<>();
                value.add(car);
                map.put(car.getBrand(), value);
            }

        }
        return map;
    }
}
