package guvi.assignments;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Kavin",24,15,1000000);
        Employee employee2 = new Employee("Raj",24,15,1017000);
        System.out.println("Employee Id : " + employee1.getEmployeeId());
        System.out.println("Salary : " + employee1.getSalary());
        System.out.println("Age : " + employee1.getAge());
        System.out.println("Name : " + employee1.getName());
        System.out.println("Employee Id : " +employee1.getEmployeeId());
        System.out.println("Age : " + employee1.getAge());
        System.out.println("Name : " + employee1.getName());
        System.out.println("Salary :" +employee1.getSalary());
    }
}