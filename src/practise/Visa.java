package Git.src.practise;
import java.util.Date;
abstract class Visa {
    String type;
    String cardName;
    String cvv;
    Date expiryDate;
    String accountHolder;
    int pin;
    String cardNumber;
    double balance;
    Visa(String cardNumber,int pin){
        this.cardNumber=cardNumber;
        this.pin=pin;
    }
    public abstract boolean authenticate(String CardNumber,int pin);
    public abstract double getBalance();
    public double withdraw(double amount, String cardNumber, int pin) {
        if(authenticate(cardNumber, pin)) {
            if (getBalance() < amount) {
                System.out.println("Insufficient balance in your account." +
                        "Balance available is rs "+ balance);
                return 0;
            } else {
                balance -= amount;
                System.out.println("Balance:" + balance + "\nWithdrawal amount: ");
                return amount;
            }
        }
        else {
            System.out.println("Invalid user name or pin.");
            return 0;
        }
    }
}