package Git.src.practise;
import java.util.Date;
abstract class Visa {
    String type;
    String cardName;
    String cvv;
    Date expiryDate;
    String accountHolder;
    int pin=01;
    String cardNumber="128";
    double balance=10000;
    public abstract boolean authenticate(String InputCardNumber,int Inputpin);
    public abstract double getBalance();
    public double withdraw(double amount) {
        if (getBalance()<amount){
            System.out.println("Insufficient balance in your account");
            return 0;
        }
        return amount;
    }
}
