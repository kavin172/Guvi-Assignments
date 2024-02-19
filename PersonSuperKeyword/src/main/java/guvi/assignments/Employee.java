package guvi.assignments;

public class Employee extends Person{
    private int employeeId;
    private int salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public int getSalary() {
        return salary;
    }

    public Employee(int employeeId, int salary) {
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public Employee(String name, int age, int employeeId, int salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }
}
