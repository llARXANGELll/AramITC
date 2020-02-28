package Work2.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vendign {
    static Scanner sc = new Scanner(System.in);
    static private List<Drink> drinks = new ArrayList<>();

    static void Fill() {
        for (int i = 0; i < 1; i++) {
            Drink d1 = new Drink("1: Cola", 70);
            Drink d2 = new Drink("2: Pepsi", 50);
            Drink d3 = new Drink("3: Sprite", 30);
            drinks.add(d1);
            drinks.add(d2);
            drinks.add(d3);
        }
    }

    public static void meny() {
        Fill();
        System.out.println("Добро пожаловать! Введите 0 чтоб открыть меню напитков, или же введите любое иное число чтоб приступить сразу у выбору напитка");
        int a = sc.nextInt();
        if (a == 0) {
            for (Drink dr : drinks) {
                System.out.println(dr.toString());
            }
        }
    }

    public static void bye() {
        int x;
        System.out.println("Какой напиток желаете купить?");
        x = sc.nextInt();
        if (x == 1) {
            System.out.println("Внесите деньги");
            cola(sc.nextInt());
        }
        if (x == 2) {
            System.out.println("Внесите деньги");
            pepsi(sc.nextInt());
        }
        if (x == 3) {
            System.out.println("Внесите деньги");
            sprite(sc.nextInt());
        } if (x !=1 && x!=2 && x !=3){
            System.out.println("Вы выбрали несуществующий номер напитка");
        }
    }

    public static void cola(int c) {
        if (c >= 70) {
            System.out.println("Спасибо за покупку ");
            if ((c - 70) >= 1) {
                System.out.println("Ваща сдача " + (c - 70) + "р");
            }
        } else {
            System.out.println("У вас нехватет средств");
        }
    }

    public static void sprite(int c) {
        if (c >= 30) {
            System.out.println("Спасибо за покупку ");
            if ((c - 30) >= 1) {
                System.out.println("Ваща сдача " + (c - 30) + "р");
            }
        } else {
            System.out.println("У вас нехватет средств");
        }
    }
    public static void pepsi(int c) {
        if (c >= 50) {
            System.out.println("Спасибо за покупку ");
            if ((c - 50) >= 1) {
                System.out.println("Ваща сдача " + (c - 50) + "р");
            }
        } else {
            System.out.println("У вас нехватет средств");
        }
    }
}



