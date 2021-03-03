package gb.java_core1.homeworkL1;

import java.util.Scanner;

public class Case3 {
    public static void main (String[] args) {
        System.out.println("Введите отредцательное или положительное число ");

        Scanner scanner= new Scanner(System.in);
        int a=scanner.nextInt();

        System.out.println ("Результат " + (sum(a)));
    }

    public static String sum (int a){
        if (0<=a) {
            return "положительное число " +a;
        } else {
            return "отридцательное цисло " +a;
        }

    }

    /*public static boolean forExample (int a) {
        return a >= 0;
    }*/
}


