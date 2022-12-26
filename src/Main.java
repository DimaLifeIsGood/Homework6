public class Main {
    public static void main(String[] args) {
CreditCard creditCard1= new CreditCard("111111",15000);
        CreditCard creditCard2= new CreditCard("111222",14000);
        CreditCard creditCard3= new CreditCard("111333",13000);
        creditCard1.plus();
        creditCard2.plus();
        creditCard3.minus();
        creditCard1.valueCard();
        creditCard2.valueCard();
        creditCard3.valueCard();

    }
}