package gb.java_core1;

import java.util.Scanner;
//Case4 - слишком перемудрили
//Обсолюно согласен с вашими коментами и можно было System.out.println ("Привет " + a + " !") ; и тоже было бы правильно
//Но было интересно применить метод с возвратом, а на такой легкой конструкции более очевидно
// как это работает¯ \ _ (ツ) _ / ¯
public class Case4 {
    public static void main (String[] args) {

        System.out.println("Как Вас завут?");

        Scanner scanner= new Scanner(System.in);
        String a=scanner.nextLine();

        System.out.println ("Привет " + (sum(a))+ "!") ;
    }

    public static String sum (String a){

            return a;
        }
}

