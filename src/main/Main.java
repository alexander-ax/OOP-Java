package main;
public class Main {
    public static void main(String[] args) {

        String[] subjects = {"Math", "Science", "English"};
        double[] grades = {85.5, 92.0, 78.5, 60};

        Student student = new Student("Alexander", subjects, grades);
        student.displayStudentInfo();

        String[] subjects1 = {"Math", "Science", "English", "ESP", "Mathss"};
        double[] grades1 = {85.5, 92.0, 78.5, 70, 90};

        Student student1 = new Student("Marco", subjects1, grades1);
        student1.displayStudentInfo();

        String[] subjects2 = {"Math", "Science", "English", "EPP"};
        double[] grades2 = {85.5, 92.0, 78.5, 60};

        Student student2 = new Student("Kevin", subjects2, grades2);
        student2.displayStudentInfo();
    }
}