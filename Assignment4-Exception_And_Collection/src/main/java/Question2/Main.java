package Question2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter voter details");
        System.out.println("Voter Id");
        int voterId = sc.nextInt();
        System.out.println("Name");
        String name = sc.next();
        System.out.println("Age");
        int age = sc.nextInt();
        Voter voter = new Voter(voterId, name, age);

        if (voter.getAge() < 18) {
            throw new InvalidAgeForVoter("Invalid age for voter");
        }
    }
}
