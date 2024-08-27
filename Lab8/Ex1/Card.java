package Ex1;

public abstract class Card implements WithdrawAble {
    private String cardNum;

    public abstract String type();
    public abstract double discount();

    public Card(String cardNum){
        this.cardNum = cardNum;
    }
    public String getCardNum() {
        return cardNum;
    }
}
