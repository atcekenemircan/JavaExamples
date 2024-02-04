package Metods;

import java.util.Scanner;

public class Level18greatest_common_diviso {
    public static int gcd(int a, int b) {
        int divisor = 1;
        for (int i = 1; (i < a) || (i < b); i++){
            if ((a % i == 0) && (b % i == 0)){
                divisor = i;
            }
        }
        return divisor;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int number2 = scanner.nextInt();
        System.out.println(gcd(number1,number2));
    }
}
