package Assignment1_5;

import java.util.Scanner;

public class CalculateDiscount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter purchase amount ");
        int amount = sc.nextInt();
        if (amount < 500) {
            System.out.println("Payable amount :" + amount);
            System.out.println("There won't be any discount for your purchase, since your purchase amount is less than 500");
        }
        else if(amount<=1000){
            double payable = amount -(amount*0.10);
            System.out.println("Payable amount after 10% discount:" + payable);
        }
        else{
            double payable = amount-(amount*0.20);
            System.out.println("Payable amount after 20% discount:" + payable);
        }
    }
}
