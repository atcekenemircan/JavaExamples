package JavaExercises;
import java.util.Scanner;
public class Level01_body_mass_index {
    public static void main(String[] args) {
         /*
        Find the body mass index of the user according to the height and weight values you received from the user.
        Body Mass Index: Weight / Height(m) * Height(m)
        */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Weight:");
        int weight = scanner.nextInt();
        System.out.print("Enter Your Height: (Example: 1.72)");
        double height = scanner.nextDouble();

        double bki = weight / (height * height);

        System.out.println("Your Body Mass Index : " + bki);
    }
}