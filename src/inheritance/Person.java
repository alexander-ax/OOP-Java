//Superclass
package inheritance;

public class Person {
    String name, religion, sex;
    int age;

    Person(){}
    Person(String name, String religion, String sex, int age){
        this.name = name;
        this.religion = religion;
        this.sex = sex;
        this.age = age;
    }

    void checkStatus(){
        System.out.println("\nName: " +name);
        System.out.println("Religion: " +religion);
        System.out.println("Sex: " +sex);
    }
}
