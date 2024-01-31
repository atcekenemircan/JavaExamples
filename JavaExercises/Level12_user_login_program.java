package JavaExercises;
import java.util.Scanner;
public class Level12_user_login_program {
    public static void main(String[] args) {

        // Try to write a user login with the help of a while loop.

        Scanner scanner = new Scanner(System.in);

        int entry_right = 3;

        String sys_user_name = "Emircan Atceken";
        String sys_password = "12345";

        System.out.println("*****************************");
        System.out.println("Welcome to User Login...");
        System.out.println("*****************************");

        while (true) {
            System.out.print("User name : ");
            String user = scanner.nextLine();
            System.out.print("Password : ");
            String password = scanner.nextLine();

            if (user.equals(sys_user_name) && password.equals(sys_password)) {
                System.out.println("Welcome, " + user);
                break;
            }
            else if (user.equals(sys_user_name) && !password.equals(sys_password)) {
                System.out.println("Your Password is Incorrect...");
                entry_right -= 1;

                System.out.println("Right of Entry: " + entry_right);
            }
            else if (!user.equals(sys_user_name) && password.equals(sys_password)) {
                System.out.println("Your Username is Incorrect...");
                entry_right -= 1;
                System.out.println("Right of Entry : " + entry_right);
            }
            else {
                System.out.println("Your Username and Password are Incorrect...");
                entry_right -= 1;
                System.out.println("Right of Entry : " + entry_right);
            }
            if (entry_right == 0){

                System.out.println("Giriş hakkınız bitti. Tekrar Bekleriz....");
                break;
            }
        }
    }
}
