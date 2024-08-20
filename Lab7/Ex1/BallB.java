package Ex1;
public class BallB extends Ball implements RollAble{

    public BallB(String s) {
        super(s);
    }

    public void roll() {
        System.out.println(super.tradeMark + " rolls smoothly.");
    }

    public void inflate(double v) {
        System.out.println(super.tradeMark + "'s ball is inflated " + v + " cu. ft.");
    }
    
}
