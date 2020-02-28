package Work5.Task1;

import java.util.Arrays;
import java.util.List;

public class Vending {

    private int cash;
    private List<Drink> drink;
    private Drink napitoc;

    Vending() {
        drink = Arrays.asList(
                new Drink("Pepsi", 70),
                new Drink("Cola", 50),
                new Drink("Sprite", 30)
        );
    }

    public void napitoc(int num) {
        if (num > 3) {
            System.out.println("net");
        } else {
            napitoc = drink.get(num);
        }
    }

    public void menu() {
        for (int i = 0; i < drink.size(); i++) {
            System.out.println(i + ": " + drink.get(i));
        }
    }

    public int caash(int sum) {
        this.cash += sum;
        System.out.println(cash);
        return cash;
    }

    public Drink buy() {
        if (napitoc == null) {
            System.out.println("Не выбран напиток");
            return null;
        }
        if (cash < napitoc.getPrice()) {
            System.out.println("Недостаточно средств");
            return null;
        }
        cash -= napitoc.getPrice();
        if (cash > 0) {
            System.out.println("Ваша сдача " + cash + ". Желаете купить еще что то");
        }
        return napitoc;
    }

    public int cansel() {
        int sum = cash;
        cash = 0;
        System.out.println(cash);
        return cash;
    }

}



