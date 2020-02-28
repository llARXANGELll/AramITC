package Work1.Task3;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Positive positive = new Positive();
        Negative negative = new Negative();
        System.out.println("Введите любое число");
        int x;
        x = sc.nextInt();
        positive.positiv(x);
        negative.negativ(x);
    }
}
