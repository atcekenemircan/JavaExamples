package JavaExercises;

import java.util.Scanner;

public class Level14_factorial {
    public static void main(String[] args){
        // while loop
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();
        int i = 1;
        int fac = 1;
        while ( number > 0){

            fac *= i * number;
            number--;

        }
        System.out.println(fac);
         */

        // for loop
        Scanner scan = new Scanner(System.in);
        int factorial = 1;

        System.out.println("enter a number: ");
        int number = scan.nextInt();

        for(int i = 1; i <= number; i++)
        {
            factorial = factorial * i;
        }
        System.out.println(number + "!= " + factorial);
    }
}
