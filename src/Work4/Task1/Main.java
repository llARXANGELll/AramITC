package Work4.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите текст");
        Scanner sc = new Scanner(System.in);
        String oldString = sc.nextLine();
        String newString = oldString.replace("бяка", "*вырезано цензуро*");

        System.out.println("Old string: " + oldString);
        System.out.println("New string: " + newString);

    }

}
