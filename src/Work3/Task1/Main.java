package Work3.Task1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//1.Реализовать алгоритм сортировки массива пузырьком и попытаться его
//        оптимизировать. Оптимизацию будем "считать" количеством итераций
//        цикла
//Оптимизировал
public class Main {
    public static void main(String[] args) {
        int[] mos = new int[10];
        Random random = new Random();
        for (int i = 0; i < mos.length; i++) {
            mos[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(mos));

        boolean sortir = false;
        while (!sortir) {
            sortir = true;
            for (int i = 1; i < mos.length; i++) {
                if (mos[i] < mos[i - 1]) {
                    int min = mos[i];
                    mos[i] = mos[i - 1];
                    mos[i - 1] = min;
                    sortir = false;

                }
            }
            System.out.println(Arrays.toString(mos));

        }

    }
}