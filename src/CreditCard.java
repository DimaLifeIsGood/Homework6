public class CreditCard {
    String numerCard;
    int balance;
    public int price=150;

    public CreditCard(String numerCard, int balance) {
        this.numerCard = numerCard;
        this.balance = balance;
    }


    public int plus(){
        this.balance+=price;
        return this.balance;
    }
    public int minus(){
        this.balance-=price;
        return this.balance;
    }
    public void valueCard(){
        System.out.println("Num card :  "+this.numerCard);
        System.out.println("Balance is :  "+this.balance);
    }
}
