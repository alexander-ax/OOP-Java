//Constructor
package revisedAnimalKingdom;
import java.util.Scanner;
public class IndexTwoConstructor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the status [1] Endangered or [2] Not Endangered: ");
        int endangered = input.nextInt();
        // Set One
        String[] animals = {
                "Sumatran Tiger (Panthera tigris sumatrae",
                "Domestic Cat (Felis catus)", "Animalia",
                "Chordata", "Mammalia", "Carnivora", "Felidae", "Felis",};
        AnimalsConstructor a = new AnimalsConstructor(animals,endangered);
        a.animalsInfo();
        //Set Two
        String[] animals1 = {
                "Philippine Crocodile (Crocodylus mindorensis)",
                "American Crocodile (Crocodylus acutus)", "Animalia",
                "Chordata", "Reptilia", "Crocodylia", "Crocodylidae", "Crocodylus"};
        AnimalsConstructor b = new AnimalsConstructor(animals1,endangered);
        b.animalsInfo();
        //Set Three
        String[] animals2 = {
                "Gooty Sapphire Ornamental Tarantula (Poecilotheria metallica)",
                "Cross Orbweaver (Araneus diadematus)", "Animalia", "Arthropoda",
                "Arachnida", "Araneae", "Varies (e.g., Araneidae, Theridiidae)", "Varies"};
        AnimalsConstructor c = new AnimalsConstructor(animals2,endangered);
        c.animalsInfo();
    }
}