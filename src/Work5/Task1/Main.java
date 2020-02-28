package Work5.Task1;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vending ven = new Vending();

        System.out.println("Добро ваожаловать, вот меню");

        ven.menu();
        ven.napitoc(sc.nextInt());
        ven.caash(sc.nextInt());
        ven.buy();
        ven.napitoc(sc.nextInt());
        ven.caash(sc.nextInt());
        ven.buy();
        ven.cansel();
    }
}