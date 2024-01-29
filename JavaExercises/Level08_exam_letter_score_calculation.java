package JavaExercises;
import java.util.Scanner;
public class Level08_exam_letter_score_calculation {
    public static void main(String[] args) {
    /*
     Try to make a letter calculation system by taking Midterm1, Midterm2 and Final grade from the user.
     Additionally, by taking the user's overall average in school,
     Print an advice message on the screen based on the condition of getting DD and being below 2.50.

     Visa1 will affect 30% of the total grade.

     Visa2 will affect 30% of the total grade.

     The final will count for 40% of the total grade.

     Total Grade >= 90 -----> AA

     Total Grade >= 85 -----> BA

     Total Grade >= 80 -----> BB

     Total Grade >= 75 -----> CB

     Total Grade >= 70 -----> CC

     Total Marks >= 65 -----> DC

     Total Grade >= 60 -----> DD

     Total Grade >= 55 -----> FD

     Total Grade < 55 -----> FF

    */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vize1 : ");
        int vize1  = scanner.nextInt();
        System.out.print("Vize2 : ");
        int vize2  = scanner.nextInt();
        System.out.print("Final : ");
        int finalnot  = scanner.nextInt();
        System.out.print("Okul Ortalamanız:");
        double ortalama = scanner.nextDouble();

        double toplamnot = (vize1 * 3 / 10.0) + (vize2 * 3 / 10.0) + (finalnot * 4 / 10.0);

        if (toplamnot >= 90) {

            System.out.println("AA aldınız...");
        }
        else if (toplamnot >= 85) {
            System.out.println("BA aldınız...");
        }
        else if (toplamnot >= 80) {
            System.out.println("BB aldınız...");
        }
        else if (toplamnot >= 75) {
            System.out.println("CB aldınız...");
        }
        else if (toplamnot >= 70) {
            System.out.println("CC aldınız...");
        }
        else if (toplamnot >= 65) {
            System.out.println("DC aldınız...");
        }
        else if (toplamnot >= 60) {
            System.out.println("DD aldınız...");

            if (ortalama < 2.50) {

                System.out.println("DD aldınız ve Not ortalamanız düşük. Bu dersi tekrardan almayı düşünebilirsiniz.");
            }
        }
        else if (toplamnot >= 55) {
            System.out.println("FD aldınız ve Kaldınız...");
        }
        else {
            System.out.println("FF aldınız ve Kaldınız...");
        }

    }
}
