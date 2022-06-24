package carEx;

import java.util.Objects;

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
public class Car implements Comparable<Car> {
    private String brand;
    private String model;
    private int price;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, price);
    }

    @Override
    public int compareTo(Car o) {
        if(model.equals(o.model)) {
            if (price - o.price > 0) {
                return 1;
            } else if (price - o.price < 0) {
                return -1;
            } else return 0;
        }else return model.compareTo(o.model);
    }
}
