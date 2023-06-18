package overloadingConstructors;

public class IndexEmployee {
    public static void main (String[] args){
        //first
        Employee a = new Employee();
        System.out.println(a.age);
        //second
        Employee b = new Employee(3);
        System.out.println(b.firstname);
        //third
        Employee c = new Employee("Alex", "Caberto", "Bulacan", "Male",3);
    }
}
