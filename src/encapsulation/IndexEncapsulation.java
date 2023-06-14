//getters and setters
package encapsulation;

public class IndexEncapsulation {
    public static void main (String[] args){
        User a = new User(12321, "Alex", "Alex", "Caberto");
        a.setUserID(22);
        int iD = a.getUserID();
        System.out.println(iD);
    }
}
