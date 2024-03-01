package Question4;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birthday (yyyy-mm-dd): ");
        String birthdayInput = scanner.nextLine();
        scanner.close();

        LocalDate birthday = LocalDate.parse(birthdayInput);

        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthday, currentDate);

        System.out.println("Your age is: " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days");
    }
}
