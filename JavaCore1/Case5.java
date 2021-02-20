package JavaCore1;

import java.util.Scanner;

public class Case5 {
    public static void main (String[] args) {

        System.out.println("Введите год");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();


        if (a % 100 == 0 && a % 400 == 0)
            System.out.println("Этот год "+a +" високосный");

        else if (a % 4 == 0 && a % 100 > 0)
            System.out.println("Этот год "+a +" високосный");

        else if (a % 100 == 0)
            System.out.println("Этот год "+a +" не високосный");

        else
            System.out.println("Этот год "+a +" не високосный");
    }
}

