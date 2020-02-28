package Work4.Task4;

public class Cat {
    private static int counter = 0;

    public  Cat() {
        counter++;
    }

    public static int sumCounter () {
        return counter;
    }
}
