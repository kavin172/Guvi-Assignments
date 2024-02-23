package Question3;

import java.util.Scanner;

public class IndexOutOfBound {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the day position");
        int position = sc.nextInt();
        if(position<7){
            System.out.println(days[position]);
        }
        else {
            throw new ArrayIndexOutOfBoundsException("The number which you have entered is not in a valid range, please enter the number between 0 to 6");
        }
    }
}
