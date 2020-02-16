import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static int val = 0;
    static int n = 0;
    static int fab = 0;


    static int[] arr;

    public static void main(String[] args) {
        System.out.println("Сколько значений чисел Фибоначи вы желаете вывести");

        val = sc.nextInt();

        arr = new int[val];

        for (int i = 0; i < val; i++) {
            arr[i] = i;
        }

        fibon();
    }
    private static void fibon(){
        if (n >= val)
            return;

        n++;

        System.out.println(val);

        int result = arr[n + 2] - arr[n + 1];

        System.out.println(result);

        fibon();
    }
}