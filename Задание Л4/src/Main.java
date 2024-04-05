

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(sum(21, 10));
        anInteger(2);
        System.out.println(gerInt(-35));
        duplicatedLine("opoo", 5);
        System.out.println(typeYear(2024));
        Array10();
        Array11();
        Array12();
        Array13();
        System.out.println(Array14( 10, 5));
    }

    //Задание 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //Задание 2
    public static void checkSumSign() {
        int a = 1;
        int b = 2;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    //Задание 3
    public static void printColor() {
        int value = 150;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (0 < value & value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    //Задание 4
    public static void compareNumbers() {
        int a = -5;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    //Задание 5
    public static boolean sum(int a, int b) {
        if (a + b >=10 & a + b <=20) {
            return true;
        } else {
            return false;
        }
    }

    //Задание 6
    public static void anInteger(int a) {
        if (a >= 0 ) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    //Задание 7
    public static boolean gerInt(int a){
        if (a >= 0){
        return false;
        } else {
            return true;
        }
    }

    //Задание 8
    public static void duplicatedLine(String str, int b){
        for (int i = 0; i < b; i++){
            System.out.println(str);
        }
    }

    // Задание 9
    public static boolean typeYear(int year){
        if ((year % 4 == 0 & year % 100 != 0) || (year % 400 == 0)){
            return true;
        } else {
            return false;
        }
    }

    // Задание10
    public static void Array10(){
        int[] arr10 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < arr10.length; i++){
            if (arr10[i] == 1){
                arr10[i] = 0;
            } else if (arr10[i] == 0){
                arr10[i] = 1;
            }
        }
        for (int i = 0; i < arr10.length; i++){
            System.out.println("arr10["+ i +"] = " + arr10[i]);
        }
    }

    //Задание 11
    public static void Array11() {
        int[] arr11 = new int[101];
        for (int i = 1; i <= 100; i++) {
            arr11[i] = i;
        }
        for (int i = 1; i <= 100; i++) {
            System.out.println("arr11[" + i + "] = " + arr11[i]);
        }
    }

    //Задание 12
    public static void Array12() {
        int[] arr12 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr12.length; i++) {
            if (arr12[i] < 6) {
                arr12[i] = arr12[i] * 2;
            }
        }
        for (int i = 0; i < arr12.length; i++) {
            System.out.println("arr12[" + i + "] = " + arr12[i]);
        }
    }

    //Задание 13
    public static void Array13() {
        int n = 10;
        int[][] table13 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == j) || (i + j == n - 1)) {
                    table13[i][j] = 1;
                }
                System.out.print(" " + table13[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Задание 14
    public static int[] Array14(int len, int initialValue){
        int[] arr14 = new int[len];
        for(int i = 0; i < len; i++){
            arr14[i] = initialValue;
            System.out.println("arr14["+ i +"] = " + arr14[i]);
        }
        return arr14;
    }

}