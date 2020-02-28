package Work1.Task1;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите два числа X и Y для сравнения что больше");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x < y) {
            System.out.println("Х меньне Y");
        } if ( x > y){
            System.out.println("Х больше Y");
        } if (x==y) {
            System.out.println("X и Y равны");
        }
    }
}
