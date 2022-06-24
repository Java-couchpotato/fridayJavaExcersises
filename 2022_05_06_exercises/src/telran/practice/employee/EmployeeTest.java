package telran.practice.employee;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    Employee emp1 = new Employee(11, "Vasya", 35, 2000);
    Employee emp2 = new Employee(02, "Masha", 35, 4500);
    Employee emp3 = new Employee(23, "Irina", 35, 1500);
    Employee emp4 = new Employee(01, "Michail", 35, 2500);



    @Test
    public void compare_byAge() {
        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        List<Employee> listExp = new ArrayList<>();
        listExp.add(emp1);
        listExp.add(emp2);
        listExp.add(emp3);
        listExp.add(emp4);


        list.sort(new CompareByAge());
        assertEquals(listExp,list);


    }

    @Test
    public void compare_1byName() {
        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        List<Employee> expected_list = new ArrayList<>();
        expected_list.add(emp3);
        expected_list.add(emp2);
        expected_list.add(emp4);
        expected_list.add(emp1);
        list.sort(new CompareByName());
        assertEquals(expected_list, list);

    } @Test
    public void compare_1bySalary() {
        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        List<Employee> expected_list = new ArrayList<>();
        expected_list.add(emp3);
        expected_list.add(emp1);
        expected_list.add(emp4);
        expected_list.add(emp2);
        list.sort(new CompareBySalary());

        assertEquals(expected_list, list);

    }@Test
    public void compare_1whenAgeSame() {
        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        List<Employee> expected_list = new ArrayList<>();
        expected_list.add(emp3);
        expected_list.add(emp2);
        expected_list.add(emp4);
        expected_list.add(emp1);
        list.sort(new CompareByNameSameAge());

        assertEquals(expected_list, list);

    }

}