public class Person3 {

    private String name;
    private int salary;

    @Override
    public String toString() {
        return "Person3{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public Person3(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}
