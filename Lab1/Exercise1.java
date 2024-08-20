import java.util.*;
import java.math.*;

public class Exercise1{
    public static void main(String[] args) {
        
        double side,length;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter triangle side: ");
        side = input.nextDouble();
        System.out.print("Enter prism length: ");
        length = input.nextDouble();

        double area = ((Math.sqrt(3)/4) * side * side) * 2;
        area = area + (3 * (side * length));

        System.out.print("Surface area of prism is " + area);
    }
}