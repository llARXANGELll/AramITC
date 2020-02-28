package Work6.Task2;

import java.util.Arrays;
import java.util.List;

public class BasketShop implements Basket{

    private  String product;
    private  int quantity;
    private List<String > goods;

    public BasketShop(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }


    public  String getProduct() {
        return product;
    }

    public  int getQuantity() {
        return quantity;
    }

    @Override
    public void addProduct(String product, int quantity) {

    }

    @Override
    public void removeProduct(String product) {

    }

    @Override
    public void updateProductQuantity(String product, int quantity) {

    }

    @Override
    public void clear() {

    }

    @Override
    public List<String> getProducts() {
        return goods;
    }

    @Override
    public int getProductQuantity(String product) {
        return 0;
    }
}
