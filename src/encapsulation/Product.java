package encapsulation;

public class Product {

    private String name;
    private double price;
    private int stockQuantity;

    public Product(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void updatePrice(double newPrice) {
        if (newPrice >= 0) {
            this.price = newPrice;
            System.out.println("The price of " + name + " has been updated to $" + newPrice);
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    public boolean checkStock(int quantity) {
        return stockQuantity >= quantity;
    }

    public void purchaseProduct(int quantity) {
        if (checkStock(quantity)) {
            stockQuantity -= quantity;
            System.out.println("You have purchased " + quantity + " units of " + name + ".");
            System.out.println("Remaining stock: " + stockQuantity);
        } else {
            System.out.println("Sorry, there is insufficient stock to purchase " + quantity + " units of " + name + ".");
        }
    }

    public static void main(String[] args) {
        Product product = new Product("Laptop", 1200.50, 10);

        System.out.println("Product: " + product.getName());
        System.out.println("Price: $" + product.getPrice());
        System.out.println("Stock Quantity: " + product.getStockQuantity());

        product.purchaseProduct(5);

        product.purchaseProduct(6);

        product.updatePrice(1100.00);
        System.out.println("Updated Price: $" + product.getPrice());

        product.purchaseProduct(3);
    }
}

