package hw01;

import java.util.ArrayList;
import java.util.List;


class Basket {
    private List<Product> purchasedProducts;

    public Basket() {
        this.purchasedProducts = new ArrayList<>();
    }

    public void addProduct(Product product) {
        purchasedProducts.add(product);
    }

    public void removeProduct(Product product, Category category) {
        purchasedProducts.remove(product);
        category.removeProduct(product);
    }

    public List<Product> getPurchasedProducts() {
        return purchasedProducts;
    }
}