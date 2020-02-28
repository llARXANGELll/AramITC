package Work1.Task3;
import java.util.Scanner;

public class Negative {
    private int y = 0;
    static Scanner sc = new Scanner(System.in);

    public void negativ(int x) {
        if (x < y && x % 2 == 0) {
            System.out.println("Введенное число отрицательное четное");
        }
        if (x < y && x % 2 != 0) {
            System.out.println("введенное число отрицательное не четное");
        } else if (x == 0) {
            System.out.println("Вы ввели ноль");
        }
    }
}
