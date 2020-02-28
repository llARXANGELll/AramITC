package Work5.Task4;

public class Main {

    public static void main(String[] args) {

        Human man = new Man("Игорь");
        System.out.println(man.getName());
        man.startRun();
        man.stopRun();
        man.startSwim();
        man.stopSwim();
        System.out.println();

        Human girl = new Girl("Лена");
        System.out.println(girl.getName());
        girl.startRun();
        girl.stopRun();
        girl.startSwim();
        girl.stopSwim();
    }
}
