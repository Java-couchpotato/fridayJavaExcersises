package telran.practice.employee;

import java.util.Comparator;

public class CompareByAge implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getAge()-o2.getAge();
    }
}
