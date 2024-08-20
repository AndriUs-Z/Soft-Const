package Ex2;
public class InventoryCart {
    private Product[] products;
    private int capacity;
    private int size;

    public InventoryCart(int capacity) {
        this.capacity = capacity;
        this.products = new Product[capacity];
        this.size = 0;
    }

    public void add(Product product) {
        if (size < capacity) {
            products[size] = product;
            size++;
        } else {
            System.out.println("Cart is full. Cannot add more products.");
        }
    }

    public Product getProductAt(int index) {
        if (index >= 0 && index < size) {
            return products[index];
        }
        return null;
    }

    public int getSize() {
        return size;
    }
}