package gb.java_core1.homeworkL2;

public class homeWorkCaseL2 {

    public static int[] myArray5 = {2, 2, 2, 2, };
    public static int somone, sometwo;


    public static void main(String[] args) {

        // Первое задание

        int[] myArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int y = 0; y < myArray.length; y++) {

//            if (myArray[y] > 0) {
//                myArray[y]=0;
//            }else {
//                myArray[y]=1;
//            }
            myArray[y] = (myArray[y] > 0) ? 0 : 1;
            System.out.print(myArray[y] + " | ");

        }
        System.out.println();


        //Второе задание

        int[] myArray2 = new int[8];
        for (int i = 0; i < myArray2.length; i++) {
            myArray2[i] = 3 * i;
            System.out.print(myArray2[i] + " | ");
        }
        System.out.println();


        //Третье задание
        //Еще одно решение (по части интресной конструкции-закоментил)

        int a;
        int[] myArray3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < myArray3.length; i++) {
            a = myArray3[i];
            if (a < 6) continue;
            System.out.print(a + " | ");
//            sumArray(a);
//            if ( sumArray(a)== true)  {
//                System.out.println();
//            }else {
//                System.out.println(a);
//            }

        }
        System.out.println();


        //Четвертое задание

        int[][] myArray4 = new int[10][10];
        for (int c = 0; c < myArray4.length; c++) {

            for (int z = 0; z < myArray4[c].length; z++) {
                int count = myArray4[c].length - z - 1;
                if (c == z || c == count) {

                    System.out.print("1");
                } else {
                    System.out.print("_");
                }

            }
            System.out.println();
        }

        //Пятое задание

        int min = 100;//возможно есть другое решение, но т.к. массив по сути не измененн то можно использовать
                        //постоянное значение, но динамика конечно лучше.
        int max = 0;
        for (int i = 0; i < myArray3.length; i++) {
            int k = myArray3[i];
            if (k > max) {
                max = k;
            } else if (k < min) {
                min = k;
            }
        }
        System.out.println("max значение в массиве " + max);
        System.out.println("min значение в массиве " + min);
        System.out.println();


        //Шестое задание

        System.out.println("Cумма левой и правой части "+multDev(myArray5));


    }
//Метод для третьего задания. Конструкция с методом и возвратом типа bool
//        public static boolean sumArray ( int a){
//            return (a < 6);
//        }
//
//    }


        //Метод делит масив попалам и возращает true если половины совпадают
    public static boolean multDev (int[] myArray5) {

        for (int i = 0; i < myArray5.length; i++) {
          if (i < myArray5.length / 2) {
              somone += myArray5[i];
          } else {
               sometwo += myArray5[i];
            }
        }
            return(somone==sometwo);
        }
    }
