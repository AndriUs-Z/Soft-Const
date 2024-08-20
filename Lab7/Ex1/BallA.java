package Ex1;
public class BallA extends Ball implements RollAble {

    public BallA(String s) {
        super(s);
    }

    public void roll() {
        System.out.println(super.tradeMark + " rolls rather smoothly.");
    }

    public void inflate(double v) {
        System.out.println(super.tradeMark + "'s ball is inflated " + v + " cu. ft.");
    }
    
}
