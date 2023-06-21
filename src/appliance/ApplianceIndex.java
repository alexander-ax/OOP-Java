package appliance;
import java.util.Scanner;
public class ApplianceIndex {
    public static void main (String[] args){
        System.out.println("\nCABERTO APPLIANCES");
        Scanner input = new Scanner (System.in);
        LaundryAppliance l = new LaundryAppliance();
        KitchenAppliance k = new KitchenAppliance();
        EntertainmentAppliance e = new EntertainmentAppliance();

        System.out.println("Which Appliances you want?\n[1] Laundry Appliances\n[2] Kitchen Appliances\n[3] Entertainment Appliances");
        System.out.println("Please choose: ");
        int choice = input.nextInt();

        if (choice == 1){
            l.setName();
            l.setDescription();
            l.items();
        }
        else if (choice == 2){
            k.setName();
            k.setDescription();
            k.items();
        }
        else if (choice == 3){
            e.setName();
            e.setDescription();
            e.items();
        }
    }
}
