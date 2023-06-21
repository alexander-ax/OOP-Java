package appliance;

public class KitchenAppliance implements Appliance{
    @Override
    public void setName() {
        System.out.println("KITCHEN APPLIANCES");
    }

    @Override
    public void setDescription() {
        System.out.println("This subclass represents appliances specifically designed for use in the kitchen.");
    }

    public void items() {
        System.out.println("\n1. Refrigerator");
        System.out.println("2. Oven");
        System.out.println("3. Dishwasher");
        System.out.println("4. Microwave");
        System.out.println("5. Blender");
        System.out.println("6. Coffee maker");
    }
}