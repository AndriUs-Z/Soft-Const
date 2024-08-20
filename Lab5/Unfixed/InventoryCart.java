package Unfixed;

public class InventoryCart {
    private Product[] products;
    private int count;
    private int capacity;

    public InventoryCart(int capacity) {
        this.capacity = capacity;
        products = new Product[capacity];
        count = 0;
    }

    public void add(Product product) {
        if (count < capacity) {
            products[count] = product;
            count++;
        } else {
            System.out.println("Cart is full. Cannot add more products.");
        }
    }

    public Product getProductAt(int index) {
        if (index >= 0 && index < count) {
            return products[index];
        } else {
            return null;
        }
    }
    
    public Product[] getAllProducts() {
        return products;
    }

    public int getCount() {
        return count;
    }
}

