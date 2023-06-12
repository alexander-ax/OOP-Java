package animalKingdom;

public class IndexTwo {
    public static void main(String[] args) {
        System.out.println("\nANIMAL KINGDOM");
        Animals main = new Animals();
        main.fetch();

        // Set One
        Animals a = new Animals();
        a.animalEndangered = "Sumatran Tiger (Panthera tigris sumatrae)";
        a.animalNotEndangered = "Domestic Cat (Felis catus)";
        a.kingdom = "Animalia";
        a.phylum = "Chordata";
        a.clas = "Mammalia";
        a.order = "Carnivora";
        a.family = "Felidae";
        a.genus = "Felis";
        a.animalsInfo();

        // Set Two
        Animals b = new Animals();
        b.animalEndangered = "Philippine Crocodile (Crocodylus mindorensis)";
        b.animalNotEndangered = "American Crocodile (Crocodylus acutus)";
        b.kingdom = "Animalia";
        b.phylum = "Chordata";
        b.clas = "Reptilia";
        b.order = "Crocodylia";
        b.family = "Crocodylidae";
        b.genus = "Crocodylus";
        b.animalsInfo();

        // Set Three
        Animals c = new Animals();
        c.animalEndangered = "Gooty Sapphire Ornamental Tarantula (Poecilotheria metallica)";
        c.animalNotEndangered = "Cross Orbweaver (Araneus diadematus)";
        c.kingdom = "Animalia";
        c.phylum = "Arthropoda";
        c.clas = "Arachnida";
        c.order = "Araneae";
        c.family = "Varies (e.g., Araneidae, Theridiidae)";
        c.genus = "Varies";
        c.animalsInfo();
    }
}