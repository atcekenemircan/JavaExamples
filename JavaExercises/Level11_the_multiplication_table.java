package JavaExercises;
public class Level11_the_multiplication_table {
    public static void main(String[] args) {
        // Create a multiplication table using a nested for loop.
        for (int i = 1 ; i <= 10 ; i++) {
            System.out.println("***********************************");
            for (int j = 1 ; j <= 10 ; j++) {
                System.out.println( i  + " x " + j + " = " + (i * j));
            }
            System.out.println("***********************************");
        }
    }
}
