package Work5.Task4;

public class Man extends Human {

    public Man(String name) {
        super(name);
    }


    @Override
    public void startRun() {
        System.out.println("Я побежал");

    }

    @Override
    public void stopRun() {
        System.out.println("Я прибежал");

    }

    @Override
    public void startSwim() {
        System.out.println("Я поплыл");
    }

    @Override
    public void stopSwim() {
        System.out.println("Я приплыл");
    }
}
