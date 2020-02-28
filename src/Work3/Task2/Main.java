package Work3.Task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Запросить у пользователя целое число N, создать двумерный массив
//        размером N на N. Заполнить его случайными числами и вывести на экран
//        сумму диагоналей массива

// Сделал, выводит сумму чисел крест накрест
public class Main {
    static Random random = new Random(10);
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Какого размера создать двухмерный массив, у которого будет вычтена диагональная сумма чисел");
        int x = sc.nextInt();
        int[][] mos = new int[x][x];
        for (int i = 0; i < mos.length; i++) {
            for (int j = 0; j < mos.length; j++) {
                mos[i][j] = random.nextInt(10);
            }
            System.out.println(Arrays.toString(mos[i]));
        }
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        for (int i = 0; i <mos.length; i++) {
                sum1 += mos[i][i];
                sum2 += mos[i][(x - 1) - i];
                sum3 = sum1 + sum2;

            }
        System.out.println("Сумма диагональных элементов равна :" + sum3);

        }
    }

