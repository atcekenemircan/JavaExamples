package JavaExercises;
import java.util.Scanner;
public class Level02_fuel_amount {
    public static void main(String[] args) {
        /*
       Get information about how much fuel a vehicle consumes per kilometer and how many kilometers it travels,
       and calculate how much the driver has to pay in total.
        */
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many cents does your car burn per kilometer? (Example: 0.32):");
        double cent = scanner.nextDouble();

        System.out.print("How many kilometers did you travel with your vehicle?:");

        int km = scanner.nextInt();

        System.out.println("Total amount you need to pay : " + (cent * km) + " $ ...");
    }
}


