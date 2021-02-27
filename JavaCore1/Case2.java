package gb.java_core1.homeworkL1;

import java.util.Scanner;
//Case2 - а зачем вы столько if-else-if используете? ведь можно только один раз спросить...
//И точно, так намного лучше получается....круто
//Стоит обращать внимание на то в каком формате возвращать результат
public class Case2 {
    public static void main (String[] args) {
        System.out.println("Введите числа a и b");

        Scanner scanner= new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();

        System.out.println ("Результат " + (sum(a,b)));
        }

        public static boolean sum (int a, int b){
            /* if (11>(a+b)) {
                return false;
             } else if ((a+b)>20){
                 return false;
            }else {
                 return true;
             }*/
            return (a+b > 10) && (a+b <= 20);
        }
}

