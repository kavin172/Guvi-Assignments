package Question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter student details");
        System.out.println("Roll No");
        int rollNo = sc.nextInt();
        System.out.println("Name");
        String name = sc.next();
        System.out.println("Age");
        int age = sc.nextInt();
        System.out.println("Course");
        String course = sc.next();
        Student student = new Student(rollNo, name, age, course);

        if (!(student.getAge() > 15 && student.getAge() < 21)) {
            throw new AgeNotWithinRangeException("The Student age is not with in the valid range");
        }
        char[] nameArray = name.toCharArray();
        for (char c : nameArray) {
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
                throw new NameNotValidException("Student name is not valid");
            }
        }
    }
}
