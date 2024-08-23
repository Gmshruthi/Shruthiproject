package Git.src.practise;

public class UnionBank extends Visa{

    @Override
    public boolean authenticate(String InputCardNumber, int Inputpin) {
        return super.cardNumber.equals(InputCardNumber) && super.pin==Inputpin;
    }
    @Override
    public double getBalance(){
        return balance;
    }
    @Override
    public double withdraw(double amount) {
        return super.withdraw(amount);
    }
}

