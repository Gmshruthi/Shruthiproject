package Git.src.practise;
import java.util.Scanner;
public class MainClassOfBanks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Bank Name:");
        String bankName = scanner.next();
        String cardNumber;
        int pin;
        double amount;
        switch (bankName.toLowerCase()) {
            case "indianbank":
                IndianBank indianBank=new IndianBank("1002",002);
                System.out.println("Enter Card Number and pin");
                cardNumber = scanner.next();
                pin = scanner.nextInt();
                System.out.println("Enter the Withdraw amount:");
                amount=scanner.nextDouble();
                System.out.println(indianBank.withdraw(amount,cardNumber, pin));
                break;
            case "unionbank":
                UnionBank unionBank = new UnionBank("1003", 003);
                System.out.println("Enter Card Number and pin");
                cardNumber = scanner.next();
                pin = scanner.nextInt();
                System.out.println("Enter the Withdraw amount:");
                amount=scanner.nextDouble();
                System.out.println(unionBank.withdraw(amount,cardNumber, pin));
                break;
            case "andhrabank":
                AndhraBank andhraBank=new AndhraBank("0999",990);
                System.out.println("Enter Card Number and pin");
                cardNumber = scanner.next();
                pin = scanner.nextInt();
                System.out.println("Enter the Withdraw amount:");
                amount=scanner.nextDouble();
                System.out.println(andhraBank.withdraw(amount,cardNumber, pin));
                break;
            default:
                System.out.println("Wrong Bank");
        }

    }
}
