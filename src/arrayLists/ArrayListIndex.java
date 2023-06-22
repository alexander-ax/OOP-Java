package arrayLists;
import main.Student;

import java.util.ArrayList;

public class ArrayListIndex {
    public static void main (String[] args){

        //String(None-primitive)
        System.out.println("\n--------------- SIMPLE USING OF ARRAY LIST ---------------");
        System.out.println("\n** STRING **");
        ArrayList <String> name = new ArrayList<String>();
        name.add("Alex");
        name.add("Marco");
        name.add("Iryl");
        //Practice the remove
        for (String names: name){
            System.out.println(names);
        }
        System.out.println("\nGetting the index: " +name.get(1));

        //Integer(Non-primitive)
        System.out.println("\n*********** INTEGER ***********");
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        for (int number: numbers){
            System.out.println(number);
        }
        //SET OR CHANGED THE VALUE
        System.out.println("\n*********** OUTPUT ***********");
        name.set(1, "Marco Antonio");
        for (String n : name){
            System.out.println(n);
        }

        System.out.println("\n--------- ARRAY LIST USING CONSTRUCTORS ---------");
        ArrayList<Animals> animals = new ArrayList<Animals>();
        animals.add(new Animals("Dog", "Walking"));
        animals.add(new Animals("Fish", "Swimming"));
        animals.add(new Animals("Bird", "Flying"));

        System.out.println();
        System.out.println("*********** Default Content ***********\n");
        //This is the default set values "Dog"
        //animals a = animals.get(2);
        //a.animalsInfo();
        animals.get(0).animalsInfo(); //<< Alternative of declaring
        animals.get(1).animalsInfo();
        animals.get(2).animalsInfo();

        System.out.println("*********** Configured Content ***********\n");
        //SET OR CHANGED THE VALUE
        animals.set(0, new Animals("Snake","Crawling"));

        for (Animals a : animals){
            a.animalsInfo();
        }
//        animals.get(0).animalsInfo();
//        animals.get(1).animalsInfo();
//        animals.get(2).animalsInfo();

        //REMOVING THE VALUE
        //name.remove(1);    << Simple
        //animals.remove(1); << Constructors

        //TO CLEAR THE VALUES
        //name.clear();      << Simple
        //animals.clear();   << Constructors

        //TO KNOW THE SIZE
        //name.size();
        //animals.size();
    }
}
