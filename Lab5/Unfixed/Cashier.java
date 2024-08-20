package Unfixed;

public class Cashier {
    private String cashierName;

    public Cashier(String cashierName) {
        this.cashierName = cashierName;
    }

    public void printReceipt(InventoryCart cart) {
        System.out.println("Pumpkin Shop (" + cashierName + ")");
        Product[] products = cart.getAllProducts();
        double total = 0;

        for (int i = 0; i < cart.getCount(); i++) {
            Product product = products[i];
            System.out.println("1 x " + product.getName() + " \t(" + product.getCode() + ") " + "\t" + product.getPrice());
            total += product.getPrice();
        }

        System.out.println("---------------");
        System.out.println("Total " + total + " $");
    }
}