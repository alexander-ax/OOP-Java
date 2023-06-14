package revisedAnimalKingdom;
import animalKingdom.IndexTwo;

public class AnimalsConstructor {
    int endangered;
    String[] animals;
    String[] args;

    public AnimalsConstructor (String[] animals, int endangered){
        this.animals = animals;
        this.endangered = endangered;
    }
    void animalsInfo(){
        switch (endangered) {
            case 1:
                System.out.println("\n" +animals[0]);
                System.out.println("- Kingdom: " + animals[2]);
                System.out.println("- Phylum: " + animals[3]);
                System.out.println("- Class: " + animals[4]);
                System.out.println("- Order: " + animals[5]);
                System.out.println("- Family: " + animals[6]);
                System.out.println("- Genus: " + animals[7]);
                break;
            case 2:
                System.out.println("\n" +animals[1]);
                System.out.println("- Kingdom: " + animals[2]);
                System.out.println("- Phylum: " + animals[3]);
                System.out.println("- Class: " + animals[4]);
                System.out.println("- Order: " + animals[5]);
                System.out.println("- Family: " + animals[6]);
                System.out.println("- Genus: " + animals[7]);
                break;
            default:
                System.out.println("Invalid Input");
                IndexTwo.main(args);
        }
    }
}