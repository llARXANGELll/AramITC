package Work5.Task4;

public abstract class Human implements Run, Swim {

    private String name;

    public Human(String name) {
        this.name = name;

    }

    public  String getName() {
        return name;
    }

}
