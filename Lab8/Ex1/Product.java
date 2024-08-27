package Ex1;
public abstract class Product {
    protected double price;
    protected double weight;

    public Product(double price) {
        this.price = price;
    }

    public abstract void setWeight(double weight);

    public double getPrice() {
        return price;
    }
}