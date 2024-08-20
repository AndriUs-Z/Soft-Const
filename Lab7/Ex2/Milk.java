package Ex2;
public class Milk extends Product {
    private double volume;

    public Milk(double price) {
        super(price);
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setWeight(double weight) {
    }

    public String toString() {
        return String.format("Milk %.0f CC", volume);
    }
}