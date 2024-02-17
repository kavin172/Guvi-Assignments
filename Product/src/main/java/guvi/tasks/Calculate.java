package guvi.tasks;

import java.util.Scanner;

public class Calculate {

    public void findPid(Product[] products){
        double max = Integer.MIN_VALUE;
        int resultPid = 0;
        for(int i = 0; i<products.length;i++){
            if(products[i].getPrice()>max){
                max = products[i].getPrice();
                resultPid = products[i].getPid();
            }
        }
        System.out.println("Resultant Pid which has the maximum price details PID = "+resultPid);
    }
    public double totalAmountSpent(Product[] products){
        double max = Double.MIN_VALUE;
        double spent;
        for(int i=0;i<products.length;i++){
            spent = products[i].price*products[i].quantity;
            if(spent>max){
                max = spent;
            }
        }
        return max;
    }
}
