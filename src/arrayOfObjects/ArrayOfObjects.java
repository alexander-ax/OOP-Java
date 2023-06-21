package arrayOfObjects;
import java.util.Scanner;

public class ArrayOfObjects {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        Student[] students = new Student[2];
        String firstname = null, lastname = null, course = null, section = null;
        int year = 0;
        System.out.println("\nSTUDENT SIMULATION");
        System.out.print("\nHow many Students you want to enter: ");
        int number = input.nextInt();
        input.nextLine();

        for (int x = 0; x <= number; x++){
            System.out.println("\n***** STUDENT " + x + " *****");
            System.out.print("First Name: ");
            firstname = input.nextLine();
            System.out.print("Last Name: ");
            lastname = input.nextLine();
            System.out.print("Course: ");
            course = input.nextLine();
            System.out.print("Section: ");
            section = input.nextLine();
            System.out.print("Year: ");
            year = input.nextInt();
            input.nextLine();
            students[x] = new Student(firstname,lastname,course,section,year);
        }

        students[1].setFirstname("Marco");

        for (Student e: students){
            e.getInformation();
        }

    }
}
