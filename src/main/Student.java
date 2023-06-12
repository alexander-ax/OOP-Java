package main;


public class Student {

    private final String name;
    private final String[] subjects;
    private final double[] grades;

    public Student(String name, String[] subjects, double[] grades) {
        this.name = name;
        this.subjects = subjects;
        this.grades = grades;
    }

    public double calculateAverageGrade() {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public void displayStudentInfo() {
        System.out.println("\nStudent Name: " + name);
        System.out.print("Subjects: ");
        for (String subject : subjects) {
            System.out.print(subject + ", ");
        }
        System.out.println();
        System.out.print("Grades: ");
        for (double grade : grades) {
            System.out.print(grade + ", ");
        }
        System.out.println();
        System.out.println("Average Grade: " + calculateAverageGrade());
    }

}
