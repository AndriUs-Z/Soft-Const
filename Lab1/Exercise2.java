import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x,y;
        x = sc.nextInt();
        y = sc.nextInt();

        if (x > 0 && y > 0){
            System.out.println("Q1");
        }else if (x < 0 && y > 0){
            System.out.println("Q2");
        }else if (x < 0 && y < 0){
            System.out.println("Q3");
        }else if (x > 0 && y < 0){
            System.out.println("Q4");
        }else if (x == 0 && y == 0){
            System.out.println("origin");
        }else if (x == 0){
            System.out.println("x-intercept");
        }else if (y == 0){
            System.out.println("y-intercept");
        }
    }
}
