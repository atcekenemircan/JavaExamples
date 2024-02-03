package Metods;

public class Level17_1to1000_primenumber {
    public static boolean is_it_prime(int number){
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        for (int i = 2; i < 1000; i++){
            if (is_it_prime(i)){
                System.out.println(i);
            }
        }
    }
}
