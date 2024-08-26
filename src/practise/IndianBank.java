package Git.src.practise;

public class IndianBank extends Visa{
    double balance=1000;
    public IndianBank(String cardNumber,int pin){
        super(cardNumber,pin);
        super.balance=this.balance;
    }

    @Override
    public boolean authenticate(String cardNumber, int pin) {
        return this.cardNumber.equals(cardNumber) && this.pin==pin;
    }
    @Override
    public double getBalance() {
        return balance;
    }

}
