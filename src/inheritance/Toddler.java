//Subclass
package inheritance;
public class Toddler extends Person{
    int money;
    Toddler(String name, String religion, String sex, int age, int money){
        super(name,religion,sex,age);
        this.money = money;
    }
    void drink(){
        System.out.println("Drinking Water");
    }
}
