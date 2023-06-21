package appliance;

public class EntertainmentAppliance implements Appliance {
    @Override
    public void setName() {
        System.out.println("ENTERTAINMENT APPLIANCES");
    }

    @Override
    public void setDescription() {
        System.out.println("This subclass represents appliances designed for entertainment purposes.");
    }

    public void items() {
        System.out.println("\n1. Television");
        System.out.println("2. Home theater system");
        System.out.println("3. Gaming console");
        System.out.println("4. Sound System");
    }
}
