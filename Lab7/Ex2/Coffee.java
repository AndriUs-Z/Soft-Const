package Ex2;
public class Coffee extends Product {
    private double weight;

    public Coffee(double price) {
        super(price);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        return String.format("Coffee %.0f Gram", weight);
    }
}
