package JavaExercises;
import java.util.Scanner;
public class Level13_interest_application {
    public static void main(String[] args) {
        /*
       Interest Application
         The user is asked to determine the principal value and the term for which he wants to invest his money.
         Get the information and print the total amount of money at the end of each year.
         Interest Rate: 6% Interest Rate
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our bank. Interest Rate 6%");

        int main_money,futures;
        System.out.print("The amount you want to deposit : ");
        main_money = scanner.nextInt();
        System.out.print("For how many years do you want to invest your money? ? ");
        futures = scanner.nextInt();

        double sum_money = main_money;
        double interest_rate = 0.06;

        for (int i =  1 ;  i<= futures ; i++) {
            sum_money = (sum_money * interest_rate) + sum_money;

            System.out.println(i + ".total money at the end of the year : " + (int)sum_money);
        }
    }
}
