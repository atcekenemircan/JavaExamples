package JavaExercises;
import java.util.Scanner;
public class Level03_interchange_two_numbers {
    public static void main(String[] args) {

        // Change the values of the two numbers you receive from the user.

        Scanner scanner = new Scanner(System.in);
        int first_number;
        int second_number;

        System.out.print("First_number : ");
        first_number = scanner.nextInt();

        System.out.print("Second_number : ");
        second_number = scanner.nextInt();
        System.out.println("Before Replacement....");

        System.out.println("First_number : " + first_number + " Second_number : " + second_number);

        int temp = first_number;
        first_number = second_number;
        second_number = temp;
        System.out.println("After Replacement....");

        System.out.println("First_number : " + first_number + " Second_number : " + second_number);

    }
}
