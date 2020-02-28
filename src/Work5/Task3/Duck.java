package Work5.Task3;

public class Duck extends Animal implements Swims, Fly, Run {

    @Override
    public void getName() {
        System.out.println("Duck");
    }

    @Override
    public void swims() {
        System.out.println("И я тоже плаваю как бублик");
    }

    @Override
    public void fly() {
        System.out.println("А еще летаю как олень");
    }

    @Override
    public void run() {
        System.out.println("И бегаю как стрекоза");
    }
}