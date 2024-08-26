package Git.src.practise;

public class UnionBank extends Visa{
    double balance=10000;
    public UnionBank(String cardNumber,int pin){
        super(cardNumber,pin);
        super.balance=this.balance;
    }
    @Override
    public boolean authenticate(String CardNumber, int pin) {
        return super.cardNumber.equals(cardNumber) && super.pin==pin;
    }
    @Override
    public double getBalance(){
        return balance;
    }

}

