import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
    
//public class Main {
    /*public static void main(String[] args) {
        BankAccount t1 = new BankAccount("User1");
        BankAccount t2 = new BankAccount("User2", 500,new Date(1, 11, 2015));
        t1.deposit(1000);
        t2.transfer(t1, 300);
        t2.withdraw(300);
        t1.show(); t2.show();
    }*/
    
    public class Main {
        public static void main(String[] args) {
            List<Product> products = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
    
            products.add(new Product(0, "Mama", 5.5));
            products.add(new Product(10, "Lays", 10.5));
    
            for (int code = 20; code <= 40; code += 10) {
                System.out.println("Enter details for product code " + code);
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Price: ");
                double price = scanner.nextDouble();
                scanner.nextLine();
                products.add(new Product(code, name, price));
            }
    
            System.out.println("\nProduct details");
            for (Product product : products) {
                System.out.println(product);
                System.out.println("--------------------");
            }
    
            // Receive product codes and quantities from user, then calculate the total price
            double totalPrice = 0;
            while (true) {
                System.out.print("Enter product code (press -1 to exit): ");
                int code = scanner.nextInt();
                if (code == -1) {
                    break;
                }
                System.out.print("Enter amount: ");
                int amount = scanner.nextInt();
    
                // Find product by code and calculate price
                boolean found = false;
                for (Product product : products) {
                    if (product.getCode() == code) {
                        totalPrice += product.getPrice() * amount;
                        System.out.println("Added " + amount + " of " + product.getName() + " to cart. Price: " + product.getPrice() + " each.");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Product code not found.");
                }
            }
            scanner.close();
    
            System.out.println("You have to pay " + totalPrice + " Bath");
        }
    }