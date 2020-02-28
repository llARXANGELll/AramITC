package Work5.Task3;

public class Cat extends Animal implements Run {

    @Override
    public void getName() {
        System.out.println("Cat");
    }

    @Override
    public void run() {
        System.out.println("А я бегаю и лежу, бегаю и лижу");
    }
}
