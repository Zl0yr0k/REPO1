package JavaCore1;

import java.util.Scanner;

public class Case2 {
    public static void main (String[] args) {
        System.out.println("Введите числа a и b");

        Scanner scanner= new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();

        System.out.println ("Результат" + (sum(a,b)));
        }

        public static boolean sum (int a, int b){
             if (11>(a+b)) {
                return false;
             } else if ((a+b)>20){
                 return false;
            }else {
                 return true;
             }
        }
} 

