package Work1.Task4;

import java.util.Scanner;

public class Geometric {
    private static int max = 1;
    static private int length;
    static Scanner sc = new Scanner(System.in);

    public void geom() {

        this.max = max;
        System.out.println("Введите число какой длины выжелаете выстроить геометрическую прогрессию, в диапазоне от 1 до 30");
        length = sc.nextInt();
        if (length > 30 || length == 0) {
            System.out.println("Вы не выполнили требуевые условия, досвидание");
        } else {
            for (int i = 0; i < length; i++) {
                max = max * 2 ;
                System.out.print(max + "; ");
            }
        }
    }
}

