import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        // zadacha 1 2

        int[] zadachaOdin = new int[3];
        zadachaOdin[0] = 1;
        zadachaOdin[1] = 2;
        zadachaOdin[2] = 3;

        double[] zadachaOdinDva = {1.57, 7.654, 9.986};

        int[] zdachaOdinTri = {44, 55, 66};

        System.out.println(Arrays.toString(zadachaOdin));

        System.out.print(zadachaOdin[0] + ", ");
        System.out.print(zadachaOdin[1] + ", ");
        System.out.print(zadachaOdin[2]);

        System.out.println();

        System.out.print(zadachaOdinDva[0] + ", ");
        System.out.print(zadachaOdinDva[1] + ", ");
        System.out.print(zadachaOdinDva[2]);

        System.out.println();

        System.out.print(zdachaOdinTri[0] + ", ");
        System.out.print(zdachaOdinTri[1] + ", ");
        System.out.print(zdachaOdinTri[2]);

        System.out.println();
        System.out.println();

        // zadacha 3

        System.out.print(zadachaOdin[2] + ", ");
        System.out.print(zadachaOdin[1] + ", ");
        System.out.print(zadachaOdin[0]);

        System.out.println();

        System.out.print(zadachaOdinDva[2] + ", ");
        System.out.print(zadachaOdinDva[1] + ", ");
        System.out.print(zadachaOdinDva[0]);

        System.out.println();

        System.out.print(zdachaOdinTri[2] + ", ");
        System.out.print(zdachaOdinTri[1] + ", ");
        System.out.print(zdachaOdinTri[0]);

        // zadacha 4

        for (int i = 0; i < zadachaOdin.length; i++) {
            if (zadachaOdin[i] % 2 == 0) {

            } else if (zadachaOdin[i] % 2 == 1)
                zadachaOdin[i] = zadachaOdin[i] + 1;

        }
        System.out.println( );
        System.out.println( );
        System.out.println(Arrays.toString(zadachaOdin));

        // chast 2 zadanie 1

        int [] taskThree = {12000, 10000, 5000, 13000, 21000};
        int sum = 0;
        for (int i = 0; i < taskThree.length; i++){
            sum = sum + taskThree[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        // zadanie 2

        int [] zarplataTwo = {11000, 13000, 4000, 12000, 21000};
        int minСost = 99999;
        int maxСost = -1;
        for (int q = 0; q < zarplataTwo.length; q++) {
         if (zarplataTwo[q] < minСost) {
             minСost = zarplataTwo[q];
         }
        }
        for (int q = 0; q < zarplataTwo.length; q++) {
            if (zarplataTwo[q] > maxСost) {
                maxСost = zarplataTwo[q];
            }
        }

        System.out.println("Минимальная сумма трат за неделю составила " + minСost + " рублей. Максимальная сумма тра за неделю " + maxСost + " рублей.");

        // zadanie 3
        int [] taskOne = {10000, 15000, 14432, 14992, 10974};
        float averageValue = 0;
        for (int i = 0; i < taskOne.length; i++){
            averageValue = taskOne[i]  + averageValue;
            averageValue = averageValue / 5;

        }
        System.out.println("Средняя сумма трат замесяц составила " + averageValue + " рублей.");

        // zadanie 4
        char[] a = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int n = a.length;
        char temp;

        for (int i = 0; i < n/2; i++) {
            temp = a[n - i - 1];
            a[n - i - 1] = a[i];
            a[i] = temp;
        }

        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }




    }



}