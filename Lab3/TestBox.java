import java.util.Scanner;

public class TestBox {
    
    public static void main(String[] args){
        /*Box b1 = new Box();
        b1.setDimension(3,4,5);
        System.out.println(b1.getVolume());*/

    }
    
    public static void resizeBox(Box b, int fold) {
        Box b2 = new Box();
        fold = 3;
        b2.setDimension(3*fold,4*fold,5*fold);
        new resizeBox();
        System.out.println(b2.getVolume());
    }
        
}

