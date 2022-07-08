
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Older17 {
    public static void main(String[] args) {
        List<Addresse> addresses = new ArrayList<>();
        Addresse a1 = new Addresse("Moscowskaya", 35);
        Addresse a2 = new Addresse("Alekseevaya", 125);
        Addresse a3 = new Addresse("Vishnevaya", 55);
        Addresse a4 = new Addresse("Vinogradnaya", 351);
        List<Person>people=new ArrayList<>();


    }

    public List<Addresse> addressOlderThen17(List<Person> input) {
        List<Addresse> adresses = input.stream()
                .filter(p -> p.getAge() > 17)
                .map(Person::getAdress)
                .collect(Collectors.toList());
        return adresses;
    }
}

class Addresse {
    String street;
    int houseNum;

    public Addresse(String street, int houseNum) {
        this.street = street;
        this.houseNum = houseNum;
    }

    @Override
    public String toString() {
        return "Addresse{" +
                "street='" + street + '\'' +
                ", houseNum=" + houseNum +
                '}';
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNum() {
        return houseNum;
    }
}

class Person {
    String name;
    int age;
    Addresse adress;

    public Person(String name, int age, Addresse adress) {
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

    public Addresse getAdress() {
        return adress;
    }
}

