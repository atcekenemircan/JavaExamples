package JavaExercises;
import java.util.Scanner;
public class Level06_body_mass_index_with_conditions {
    public static void main(String[] args) {
        /*
     Calculate the body mass index according to the height and weight values obtained from the user and print the following text on the screen according to these rules.

             Body Mass Index: Weight / Height(m) * Height(m)

             If BMI is below 18.5 -------> Underweight

             If BMI is between 18.5 and 25 ------> Normal

             If BMI is between 25 and 30 --------> Overweight

             If BMI is over 30 -------------> Obese
        */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Weight:");
        int weight = scanner.nextInt();

        System.out.print("Height (Expr : 1,72): ");
        double height = scanner.nextDouble();

        double bmi = (weight / (height  * height));

        if (bmi < 18.5) {
            System.out.println("weak");
        }
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal");
        }
        else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("obese");
        }
    }
}
