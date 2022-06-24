package telran.practice;
////1.Write a program by creating an "Employee" class having the following methods and print the final salary.
////- constructor which accepts the salary, numbers of employee's working hours per day as parameters
////- 'addSalary()' method which adds $10 to the salary of the employee if it is less than $500
////- "addWork()" method which adds $5 to the employee's salary if the number of working hours per day is
////more than 6 hours
public class Employee {
    int salary;
    int numOfHours;

    public Employee(int salary, int hours) {
        this.salary = salary;
        this.numOfHours = hours;
    }

    public void addSalary(){
        if (salary<500){
            salary+=10;
        }
    }
    public void addWork(){
        if (numOfHours>6){
            salary+=5;
        }
    }
}
