package hw01;


public class App {
    public static void main (String[] args) {
        Category electronics = new Category("Electronics");
        Category groceries = new Category("Groceries");

        Product tv = new Product("TV", 500, 3);
        Product phone = new Product("Phone", 200, 1);     
        Product fridge = new Product("Fridge", 800, 5);
        Product hairdryer = new Product("Hairdryer", 150, 2);

        Product bread = new Product("Bread", 1, 4);
        Product milk = new Product("Milk", 1.5, 5);
        Product egs = new Product("Egs", 2, 3);
        Product rum = new Product("Rum", 10, 5);


        electronics.addProduct(tv);
        electronics.addProduct(phone);
        electronics.addProduct(fridge);
        electronics.addProduct(hairdryer);

        groceries.addProduct(milk);
        groceries.addProduct(bread);
        groceries.addProduct(egs);
        groceries.addProduct(rum);


        System.out.println("Catalog:");
        for (Product product : electronics.getProducts()) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
        for (Product product : groceries.getProducts()) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }

        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");

        user1.getBasket().addProduct(tv);
        electronics.removeProduct(tv);

        user2.getBasket().addProduct(bread);
        groceries.removeProduct(bread);

        System.out.println("\nRemaining Products:");
        electronics.displayRemainingProducts();
        groceries.displayRemainingProducts();

        System.out.println("\nPurchases:");
        System.out.println("User1's purchases:");
        for (Product product : user1.getBasket().getPurchasedProducts()) {
            System.out.println(product.getName());
        }
        System.out.println("\nUser2's purchases:");
        for (Product product : user2.getBasket().getPurchasedProducts()) {
            System.out.println(product.getName());
        }
    }
}