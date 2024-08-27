package Ex1;

import java.util.HashMap;
import java.util.Map;

public class Cashier {
    private InventoryCart cart;
    private Card card;
    private String name;

    public Cashier() {
    }

    public void printReceipt() {
        System.out.println("-------------------------------------");
        System.out.println("Pumpkin Shop");
        System.out.println("CARD TYPE : "+ card.type());
        System.out.println("CARD NUMBER : " + card.getCardNum());

        Map<String, ProductInfo> productMap = new HashMap<>();
        double total = 0;

        for (int i = 0; i < cart.getSize(); i++) {
            Product p = cart.getProductAt(i);
            String key = p.toString();
            productMap.putIfAbsent(key, new ProductInfo(p));
            productMap.get(key).incrementQuantity();
            total += p.getPrice();
        }

        for (ProductInfo info : productMap.values()) {
            System.out.printf("%d x %s %.0f%n",
                    info.getQuantity(), info.getProduct().toString(), info.getTotalPrice());
        }
        System.out.println("CARD DISCOUNT : " + card.discount() + "%");
        System.out.println("-------------------------------------");
        System.out.printf("Total %.2f $%n", total-total*card.discount()/100);
        ((SavingAccount.DebitCard) card).withdraw(total-total*card.discount()/100);
    }

    private class ProductInfo {
        private Product product;
        private int quantity;

        public ProductInfo(Product product) {
            this.product = product;
            this.quantity = 0;
        }

        public void incrementQuantity() {
            quantity++;
        }

        public int getQuantity() {
            return quantity;
        }

        public Product getProduct() {
            return product;
        }

        public double getTotalPrice() {
            return product.getPrice() * quantity;
        }
    }

    public void doPayment(InventoryCart ic, Card card) {
      //  return ;
      this.cart = ic;
      this.card = card;
    }
}