package Work5.Task3;

public class Main {

    static Animal fish = new Fish();
    static Animal duck = new Duck();
    static Animal cat = new Cat();

    static Fish fishFly = new Fish();
    static Duck duckThree = new Duck();
    static Cat catRun = new Cat();

    public static void main(String[] args) {
        fish.getName();
        fishFly.swims();
        System.out.println();

        duck.getName();
        duckThree.swims();
        duckThree.fly();
        duckThree.run();

        System.out.println();

        cat.getName();
        catRun.run();
    }

}
