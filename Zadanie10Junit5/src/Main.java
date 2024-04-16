import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println(factorialNumber(-5));
    }
    public static int factorialNumber(int f){
        if(f < 0){
            throw new IllegalArgumentException("Факториал отрицательного числа не определен");
        } else {
            int num = 1;
            for (int i = 1; i <= f; i++) {
                num = num * i;
            }
            return num;
        }
    }
}
