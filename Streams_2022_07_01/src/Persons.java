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
