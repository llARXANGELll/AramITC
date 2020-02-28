package Work1.Task4;

import java.util.Scanner;

public class Arithmetic {
    private static int x;
    private static int y;
    private static int c;
    private static int z;

    static Scanner sc = new Scanner(System.in);

    public void aric() {

        System.out.println("Введите два значения, исходя из разницы которых будет задан шаг для выстраивания арифмитической прогрессии");
         this.x = sc.nextInt();
         this.y = sc.nextInt();
        System.out.println("Какой длины вывести прогрессию?");
        c = sc.nextInt();
        if (x >= y) {
            System.out.println("Первое значение должно быть меньше второго");
        }
        if (x < y && x % y != 0) {
            System.out.println("Арифметическая прогрессия равна ");
            System.out.print(x + "; ");
            for (int i = 1; i < c; i++) {
                z = ((y-x) * i) +x;
                System.out.print(z + "; ");
            }
        }
    }
}

