public class Employee implements  Taxable{
    private int employeeId;
    private String name;
    private int salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public Employee() {
    }

    public Employee(int employeeId, String name, int salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void calcTax() {
        double incomeTax = salary * Taxable.incomeTax;
        System.out.println("Income Tax will be : " + incomeTax);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
