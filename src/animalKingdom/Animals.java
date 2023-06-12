package animalKingdom;
import java.util.Scanner;

public class Animals {
    static int endangered;
    String animalEndangered, animalNotEndangered;
    String kingdom, phylum, clas, order, family, genus;
    private String[] args;

    public void fetch(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the status [1] Endangered or [2] Not Endangered: ");
        endangered = input.nextInt();
    }

    public void animalsInfo() {
            switch (endangered) {
                case 1:
                    System.out.println("\n" +animalEndangered);
                    System.out.println("- Kingdom: " + kingdom);
                    System.out.println("- Phylum: " + phylum);
                    System.out.println("- Class: " + clas);
                    System.out.println("- Order: " + order);
                    System.out.println("- Family: " + family);
                    System.out.println("- Genus: " + genus);
                    break;
                case 2:
                    System.out.println("\n" +animalNotEndangered);
                    System.out.println("\n" +animalNotEndangered);
                    System.out.println("- Kingdom: " + kingdom);
                    System.out.println("- Phylum: " + phylum);
                    System.out.println("- Class: " + clas);
                    System.out.println("- Order: " + order);
                    System.out.println("- Family: " + family);
                    System.out.println("- Genus: " + genus);
                    break;
                default:
                    System.out.println("Invalid Input");
                    IndexTwo.main(args);
            }
        }
}