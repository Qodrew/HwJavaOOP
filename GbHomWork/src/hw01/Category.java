package hw01;

import java.util.ArrayList;
import java.util.List;


class Category {
    private String name;
    private List<Product> products;

    public Category(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void displayRemainingProducts() {
        System.out.println("Remaining goods in " + this.name + " category:");
        for (Product product : products) {
            System.out.println(product.getName());
        }
    }
}