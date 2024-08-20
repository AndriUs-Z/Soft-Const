package Ex1;
public abstract class Ball{
    
    protected String tradeMark;
    
    public Ball(String s){
        tradeMark = s;
    }

    public abstract void inflate(double v);

    public String getTradeMark() {
        return tradeMark;
    }
}
