public class Person2 {
    private String name;

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private int age;
}
