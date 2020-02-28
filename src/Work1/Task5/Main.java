package Work1.Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введиче нужный год в консоле");
        int x = sc.nextInt();

        if (x%150 == 0 || x%4 == 0) {
            System.out.println(x + "-й год високосный!");
        } else {
            System.out.println(x + "-й год не високосный!");
        }
    }
}
