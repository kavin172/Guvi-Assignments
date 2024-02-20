package Assignment1_3;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a;
        int ans = 0;
        int n=0;
        System.out.println("Number Before Reversing "+ a);
        while(b>0){
            b=b/10;
            n++;
        }
        while(a>0){
            int temp = a%10;
            ans=ans*10+temp;
            a=a/10;
        }
        System.out.println("Number After Reversing "+ans);
    }
}
