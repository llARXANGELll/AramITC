package Work2.Task1;

public class Drink {
    private String name;
    private int price;

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
        if (price < 0) {
            System.out.println("Нельзя указывать цену ниже нуля");
        }
    }
    public String getName () {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public String toString() {
        return this.name + ": Цена " + this.price + "р";
    }
}
