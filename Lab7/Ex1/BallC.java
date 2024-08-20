package Ex1;
public class BallC extends Ball implements RollAble {


    public BallC(String s) {
        super(s);
    }

    public void roll() {
        System.out.println(super.tradeMark + " rolls very smoothly.");
    }

    public void inflate(double v) {
        System.out.println(super.tradeMark + "'s ball is inflated " + v + " cu. ft.");
    }
    
}
