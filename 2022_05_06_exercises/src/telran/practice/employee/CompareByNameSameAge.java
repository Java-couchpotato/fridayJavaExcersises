package telran.practice.employee;

import java.util.Comparator;

public class CompareByNameSameAge implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {

        return (o1.getAge() == o2.getAge()) ? (o1.getName().compareTo(o2.getName())) : o1.getAge() - o2.getAge();
    }
}
