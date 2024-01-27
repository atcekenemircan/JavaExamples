package JavaExercises;
import java.util.Scanner;
public class Level04_finding_hypotenuse {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int a;
        int b;
        System.out.print("first side : ");
        a = scanner.nextInt();
        System.out.print("second side : ");
        b = scanner.nextInt();

        double h = Math.sqrt(a * a + b * b);
        System.out.println("hypotenuse : " + h);

    }
}
