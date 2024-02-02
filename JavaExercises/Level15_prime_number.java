package JavaExercises;

import java.util.Scanner;

public class Level15_prime_number {
    public static void main(String[] args){
        // Prime numbers from 0 to 1000

        for (int i = 3; i <= 1000; i++){
            int x = i-1;

            while (x > 1){
                if (i % x != 0){
                    System.out.println(i);
                }
                x--;
            }

        }

    }
}
