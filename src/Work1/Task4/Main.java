package Work1.Task4;

import java.util.Scanner;

public class Main {
    static Geometric geo = new Geometric();
    static Scanner sc = new Scanner(System.in);
    static Arithmetic ari = new Arithmetic();
    static int n;
    public static void main(String[] args) {
        System.out.println("Введите число 1 если желаете вычислить геометрическую прогрессию, и число 2 если арифметическую");
        n = sc.nextInt();
        while (n != 1 && n != 2) {
            System.out.println("Введите указанные значения");
            n = sc.nextInt();
        }
        if (n == 1) {
            geo.geom();
        }
        if (n == 2) {
            ari.aric();
        }

    }
}
