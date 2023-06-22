package arrayLists;

import main.Student;

public class Animals {
    String name;
    String category;

    Animals (String name, String category) {
        this.category = category;
        this.name = name;
    }
    void animalsInfo(){
        System.out.println(name);
        System.out.println("This animals is " + category + "\n");
    }
    void reverse(){
        System.out.println("\nYes true I'm a " + name);
    }
}
