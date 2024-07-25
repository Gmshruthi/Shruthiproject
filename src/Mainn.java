public class Mainn {
    public static void main(String args[])
    {
        BankAccount bank=new BankAccount();
        bank.setAccountNumber("QQ1091");
        bank.setBalance(240000);
        bank.deposit(2900.0);
        bank.withdraw(2000);
        bank.getAccountNumber();
        bank.getBalance();


    }
}
