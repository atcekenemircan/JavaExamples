package JavaExercises;
import java.util.Scanner;
public class Level07_simple_calculator {
    public static void main(String[] args) {
        // Try to design a calculator that performs 4 operations using Switch Case.
        Scanner scanner = new Scanner(System.in);
        System.out.println("************************************");
        String islemler = "1. addition\n"
                +"2. subtraction\n"
                +"3. multiplication\n"
                +"4. division";
        System.out.println(islemler);
        System.out.println("************************************");
        System.out.println("Select Transaction:");
        String islem = scanner.nextLine();
        int a;
        int b;

        switch(islem){
            case "1":
                System.out.print("First Number: ");
                a = scanner.nextInt();
                System.out.print("Second Number: ");
                b = scanner.nextInt();
                System.out.println("Total of Entered Values : " + (a+b));
                break;
            case "2":
                System.out.print("First Number: ");
                a = scanner.nextInt();
                System.out.print("Second Number: ");
                b = scanner.nextInt();
                System.out.println("Differences of Entered Values : " + (a-b));
                break;
            case "3":
                System.out.print("First Number: ");
                a = scanner.nextInt();
                System.out.print("Second Number: ");
                b = scanner.nextInt();
                System.out.println("Multiplications of Entered Values : " + (a * b));
                break;
            case "4":
                System.out.print("First Number: ");
                a = scanner.nextInt();
                System.out.print("Second Number: ");
                b = scanner.nextInt();
                System.out.println("Division of Entered Values : " + ((double)a / b));
                break;
            default:
                System.out.println("Invalid Transaction");

        }
    }
}
