package JavaCore1;

import java.util.Scanner;

public class Case1 {
    public static void main (String[] args) {
        System.out.println("Введите числа a b c d");

        Scanner scanner= new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int d=scanner.nextInt();
       System.out.println("Результат=" + ((float) (resSum(a,b,c,d)))) ;
        }

    public static int resSum (int a, int b, int c, int d) {
        return a * (b + (c / d));
    }
} 
