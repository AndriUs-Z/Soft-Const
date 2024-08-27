package Ex1;
public class Sugar extends Product {
    private double weight;

    public Sugar(double price) {
        super(price);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public String toString() {
        return String.format("Sugar %.0f Gram", weight);
    }
}
