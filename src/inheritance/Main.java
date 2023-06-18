package inheritance;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        Person p = new Person("Alexander", "Catholic", "Male", 22);
        Toddler t = new Toddler("Marco", "Iglesia", "Female", 23, 2342);

//        You can instantiate from the super class down to subclass
//        Person p = new Person("Alexander", "Catholic", "Male", 22);
//        Person t = new Toddler("Marco", "Iglesia", "Female", 23, 2342);

        System.out.print("Put a grade 1-10: ");
        int grado = input.nextInt();
        Kid k = new Kid(grado);

        p.checkStatus();
        t.checkStatus(); // Adding the money details
        k.checkGrade(); // Adding the grade
    }
}
