package Question4;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        //Add Student to map
        StudentGradeTracker studentGradeTracker = new StudentGradeTracker();
        studentGradeTracker.addStudent("Kavin",100);
        studentGradeTracker.addStudent("Raj",99);
        studentGradeTracker.addStudent("Kavinraj",98);
        studentGradeTracker.addStudent("Kavi",97);
        studentGradeTracker.addStudent("KaviRaj",96);

        //Remove Student From Map
        studentGradeTracker.removeStudent("KaviRaj");

        //Display Grade as per the name
        studentGradeTracker.displayStudentGrade("Kavin");
        studentGradeTracker.displayStudentGrade("Raj");

    }
}
