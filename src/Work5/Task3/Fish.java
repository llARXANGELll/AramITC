package Work5.Task3;

public class Fish extends Animal implements Swims {

    @Override
    public void getName() {
        System.out.println("Fish");
    }

    @Override
    public void swims() {
        System.out.println("Я плаваю как бублик");
    }
}
