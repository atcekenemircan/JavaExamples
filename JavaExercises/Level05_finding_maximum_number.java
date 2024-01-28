package JavaExercises;
import java.util.Scanner;
public class Level05_finding_maximum_number {
    public static void main(String[] args) {
        // Finding the Largest Number among 3 Numbers Received from the User
        Scanner scanner =  new Scanner(System.in);

        System.out.print("First number : ");
        int a = scanner.nextInt();
        System.out.print("Second number : ");
        int b  = scanner.nextInt();
        System.out.print("Third number : ");
        int c  = scanner.nextInt();

        int maks = -1;

        if ( a >= b && a >= c) {
            maks = a;}
        else if (b >= a && b >= c) {
            maks = b;}
        else {
            maks = c;}

        System.out.println("Maximum Number : " + maks);
    }
}
