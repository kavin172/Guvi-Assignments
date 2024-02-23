package Question4;

import java.util.HashMap;
import java.util.Map;

public class StudentGradeTracker {
    private Map<String, Integer> student;
    StudentGradeTracker(){
        student = new HashMap<>();
    }
    public void addStudent(String name, int grade){
        student.put(name,grade);
    }
    public void removeStudent(String name){
        student.remove(name);
    }
    public void displayStudentGrade(String name){
        Integer grade = student.get(name);
        if(grade!=null)
            System.out.println("Grade of "+name+" is "+ grade);
        else
            System.out.println("Student "+name+" is not available in DB");
    }
}
