public class Product implements Taxable {
    int pid;
    double price;
    int quantity;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public void calcTax() {
        double salesTax = price/quantity * Taxable.salesTax;
        System.out.println("sales Tax will be :" + salesTax);
    }
}
