package no4;

import java.util.HashMap;

class StudentGrades {

    private HashMap<String, Integer> grades = new HashMap<>();


    public void addStudent(String name, int grade) {
        grades.put(name, grade);
        System.out.println("Student added successfully.");
    }


    public void removeStudent(String name) {
        if (grades.containsKey(name)) {
            grades.remove(name);
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }


    public void displayGrade(String name) {
        if (grades.containsKey(name)) {
            System.out.println("Grade of " + name + " is: " + grades.get(name));
        } else {
            System.out.println("Student not found.");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        StudentGrades sg = new StudentGrades();

        sg.addStudent("Ravi", 85);
        sg.addStudent("Meena", 92);

        sg.displayGrade("Ravi");

        sg.removeStudent("Meena");

        sg.displayGrade("Meena");
    }
}
