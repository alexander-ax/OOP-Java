package inheritance;

public class Main {
    public static void main (String[] args){
        Person p = new Person("Alexander", "Catholic", "Male", 22);
        Toddler t = new Toddler("Marco", "Iglesia", "Female", 23, 2342);

        p.checkStatus();
        t.checkStatus();

        t.drink();
        System.out.println(t.money);
    }
}
