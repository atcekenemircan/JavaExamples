package JavaExercises;
import java.util.Scanner;
public class Level09_atm_program {
    public static void main(String[] args) {
        /*
      Try to make an ATM program using a while loop.

         Transactions
         Step 1: Learning Balance
         Transaction 2: Withdrawal
         Transaction 3: Deposit
         Output: q

        */
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;
        String transactions = "Transaction 1: Learning Balance\n"
                + "2nd Transaction: Withdrawal\n"
                + "3rd Transaction: Deposit\n"
                + "Press q to exit";

        System.out.println("*************************");
        System.out.println(transactions);
        System.out.println("*************************");

        while (true) {

            System.out.print("Select Transaction: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {

                System.out.println("Exiting the Program...");
                break;
            }
            else if (islem.equals("1")){
                System.out.println("your balance : " + bakiye);
            }
            else if (islem.equals("2")){
                System.out.print("The amount you want to withdraw : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();

                if (bakiye - tutar < 0) {

                    System.out.println("Not Enough Balance. your balance : " + bakiye);
                }
                else {
                    bakiye -= tutar;
                    System.out.println("Your new balance : " + bakiye);
                }
            }
            else if (islem.equals("3")){
                System.out.print("The amount you want to deposit : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();

                bakiye += tutar;

                System.out.println("Your New Balance  : " + bakiye);
            }
            else {
                System.out.println("Invalid Transaction...");
            }
        }
    }
}
