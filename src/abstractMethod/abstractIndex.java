package abstractMethod;
public class abstractIndex {
    public static void main (String[] args){
        Human male = new Male();
        Human female = new Female();
        Human genderQueer = new GenderQueer();

        String[] name = {"Male", "Female", "Gender Fluid"};

        male.setGenderName(name);
        male.genderDescription();
        System.out.println();

        female.setGenderName(name);
        female.genderDescription();
        System.out.println();

        genderQueer.setGenderName(name);
        genderQueer.genderDescription();
        System.out.println();

    }
}
