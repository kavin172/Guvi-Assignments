package guvi.tasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<5;i++){
            System.out.println("This is product : details "+(i+1));
            System.out.println("Please enter pid ");
            int pid = sc.nextInt();
            System.out.println("Please enter price of the product ");
            double price = sc.nextDouble();
            System.out.println("Please enter no of Quantities ");
            int quantities = sc.nextInt();
            Product product = new Product(pid, price,quantities);
            products[i] = product;
        }
        Calculate cal = new Calculate();
        cal.findPid(products);
        double maxSpent = cal.totalAmountSpent(products);
        System.out.println(maxSpent);
    }
}