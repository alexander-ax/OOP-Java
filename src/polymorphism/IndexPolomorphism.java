package polymorphism;

public class IndexPolomorphism {
    public static void main (String[] args) {
        TreeSpecies t = new TreeSpecies();
        TreeSpecies palm = new Palm();
        TreeSpecies fruit = new Fruit();
        TreeSpecies evergreen = new Evergreen();
        TreeSpecies deciduous = new Deciduous();
        TreeSpecies coniferous = new Coniferous();
        palm.getInfo();
        fruit.getInfo();
        evergreen.getInfo();
        deciduous.getInfo();
        coniferous.getInfo();
        /*for (int x = 1; x <= 5; x++) {
            if (x == 1) palm.getInfo();
            else if (x == 2) fruit.getInfo();
            else if (x == 3)evergreen.getInfo();
            else if (x == 4) deciduous.getInfo();
            else if (x == 5) coniferous.getInfo();
            else System.out.println("Thank you!");
        }*/
    }
}
