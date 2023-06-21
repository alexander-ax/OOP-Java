package appliance;

public class LaundryAppliance implements Appliance{
    @Override
    public void setName() {
        System.out.println("LAUNDRY APPLIANCES");
    }
    @Override
    public void setDescription() {
        System.out.println("This subclass represents appliances used for laundry-related tasks.");
    }
    public void items() {
        System.out.println("\n1. Washing machine");
        System.out.println("2. Dryer");
        System.out.println("3. Iron");
        System.out.println("4. Steamer");
    }
}