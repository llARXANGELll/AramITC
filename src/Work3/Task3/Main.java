package Work3.Task3;

import java.util.Scanner;

//Реализовать расчет и вывод в консоль последовательности чисел
//Фибоначчи до указанного пользователем N, посредством рекурсии

// Указывается шаг, и выводит окончательная сумма с учетом указанного шага
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число в консоль до которого будет расчитана последовательности чисел\n" +
                "Фибоначчи  ");
//        System.out.println(fib(sc.nextInt()));
    }
}

    // Вариация выполнения 1 (как было у вас в методичке)
//    public static int fib(int n) {
//
//        if (n == 0) {
//            return 0;
//        }
//        if (n == 1) {
//            return 1;
//        } else {
//            return fib(n - 1) + fib(n - 2);
//        }
//    }
//}
   // Вариация выполнения 2 (смог найти более простую формулу)
//    public static int fib(int n) {
//        if (n < 2) {
//            return n;
//        }
//        return fib(n - 1) + fib(n - 2);
//    }
//}
