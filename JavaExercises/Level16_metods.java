package Metods;

public class Level16_metods {

    public static int multiply_by_two(int a){
        return 2 * a;
    }
    public static int add_two(int a){
        return 2 + a;
    }
    public static int multiply_by_three(int a){
        return 3 * a;
    }
    public static void main(String[] args){
        System.out.println("conclusion  = "+ multiply_by_three(add_two(multiply_by_two(5))));
    }
}


