package Git.src.practise;

import java.util.Scanner;

public class MainClassOfBanks {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Card Number and Pin :");
        String InputCardNumber= scanner.nextLine();
        int InputPin= scanner.nextInt();
        UnionBank unionBank=new UnionBank();
        if(unionBank.authenticate(InputCardNumber,InputPin)){
            System.out.println("Enter your withdrawing amount:");
            double amount= scanner.nextDouble();
            System.out.println("Existing Balance:"+unionBank.getBalance());
            System.out.println("Withdrawing Amount:"+unionBank.withdraw(amount));
        }
        else{
            System.out.println("Invalid User Id");
        }
    }
}
