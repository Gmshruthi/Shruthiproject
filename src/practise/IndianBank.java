package Git.src.practise;

public class IndianBank extends Visa{

    @Override
    public boolean authenticate(String cardNumber, int pin) {
        return this.cardName.equals(cardNumber) && this.pin==pin;
    }
    @Override
    public double getBalance() {
        return 0;
    }
    public double withdraw(double amount) {
        return super.withdraw(amount);
    }
}
