package Work5.Task4;

public class Girl extends Human {

    public Girl(String name) {
        super(name);
    }


    @Override
    public void startRun() {
        System.out.println("Я побежала");
    }

    @Override
    public void stopRun() {
        System.out.println("Я прибежала");
    }

    @Override
    public void startSwim() {
        System.out.println("Я поплыла");
    }

    @Override
    public void stopSwim() {
        System.out.println("Я приплыла");
    }
}
