package Ex1;
public class main {

    static void TestBall(Ball b, double a){
        System.out.println(b.getTradeMark() + " is a tradeMark of " + b.getClass().getSimpleName());
        b.inflate(a);
        ((RollAble) b).roll();  
    }
    public static void main(String[] args) {
        Ball b1 = new BallA("Zentia");
        Ball b2 = new BallB("Zepphire");
        Ball b3 = new BallC("Zenith");

        TestBall(b1,1.1);
        TestBall(b2,1.2);
        TestBall(b3,1.3);
    }
}
