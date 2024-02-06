package Metods;

import java.util.Scanner;

public class Level19_advanced_calculator {
    public static int addition(int x, int y){
        return x + y;
    }
    public static int substraction(int x, int y){
        return x - y;
    }
    public static int multiplication(int x, int y){
        return  x*y;
    }
    public static int division(int x, int y){
        return x/y;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter to first number");
            int number1 = scanner.nextInt();

            System.out.println("Enter to second number");
            int number2 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Select the action you want to perform. " +
                    "Press 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division, q for output.");
            String transactions = scanner.nextLine();

            if (transactions.equals("q")){
                System.out.println("Exiting...");
                break;
            } else if (transactions.equals("1")) {
                System.out.println(addition(number1,number2));
            } else if (transactions.equals("2")) {
                System.out.println(substraction(number1,number2));
            } else if (transactions.equals("3")) {
                System.out.println(multiplication(number1,number2));
            } else if (transactions.equals("4")) {
                System.out.println(division(number1,number2));
            } else{
                System.out.println("invalid transaction");
            }
        }

    }
}
