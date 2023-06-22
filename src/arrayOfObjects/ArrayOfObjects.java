package arrayOfObjects;
import java.util.Scanner;

public class ArrayOfObjects {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        Student[] students = new Student[5];
        String firstname, lastname, course, section;
        int year;
        System.out.println("\nSTUDENT SIMULATION");
        System.out.print("\nHow many Students you want to enter: ");
        int number = input.nextInt();
        input.nextLine();

        for (int x = 0; x < number; x++){
            System.out.println("\n***** STUDENT *****");
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
            System.out.println(x);
        }

        //Setter: try to change the index 1 to "Marco"
        students[1].setFirstname("Marco");

        for (Student e: students){
            e.getInformation();
        }
    }
}
