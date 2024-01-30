package JavaExercises;
import java.util.Scanner;
public class Level10_armstrong_number {
    public static void main(String[] args) {
        /*
         Try to find out whether an entered number is an Armstrong number.
         For example, for a 4-digit number to be an Armstrong number, it must meet the following condition.
         1634 = 1^4 + 6^4 + 3^4 + 4^4 (4 is the number of digits here)
         371 = 3^3 + 7^3 + 1^3 (3 is the number of digits here)

         You can make this program with the help of the do while loop.
        */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int number = scanner.nextInt();
        System.out.print("Number of Digits : ");
        int digit_number = scanner.nextInt();

        int temp_number = number;
        int sum = 0;

        do {
            int digit_value = temp_number % 10;
            temp_number /= 10;

            sum += Math.pow(digit_value,digit_number);

        }while(temp_number > 0);

        if (number == sum) {

            System.out.println("This number is an Armstrong number...");
        }
        else {
            System.out.println("This number is not an Armstrong number...");
        }
    }
}
