package string_02_02_22hw.Streams_2022_07_01.src;

import string_02_02_22hw.Streams_2022_07_01.src.Address;

public class Persons {
    String name;
    int age;
    Address adress;

    public Persons(String name, int age, Address adress) {
        this.name = name;
        this.age = age;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", adress=" + adress +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAdress() {
        return adress;
    }
}
