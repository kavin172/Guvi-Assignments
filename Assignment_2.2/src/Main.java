public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1,"Kavin",1017000);
        Product product = new Product(1,10000,65);
        employee.calcTax();
        product.calcTax();
    }
}