package Work5.Task1;

public class Drink {
    private String name;
    private int price;

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }


    public int getPrice() {
        return this.price;
    }

    public String toString() {
        return this.name + ": Цена " + this.price + "р";
    }
}
