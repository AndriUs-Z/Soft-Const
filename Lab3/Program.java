import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.name = "Harry Potter and The Chamber of Secret";
        book1.author = "J.K. Rowling";
        book1.year = 2542;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book name: ");
        String name = sc.nextLine();
        System.out.print("Enter Book price: ");
        Double price = sc.nextDouble();
        System.out.println("Book : " + name);
        System.out.println("Written by " + book1.author + " in " + book1.year);
        System.out.println("Price is " + price + " Baht");

        Book book2 = new Book();
        System.out.println(book2.name);
    }
}
