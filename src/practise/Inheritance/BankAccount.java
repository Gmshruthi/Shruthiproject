package Git.src.practise.Inheritance;

 class BankAccount {
     protected int accountNumber = 123456;
     protected double balance = 1261;
     double amount;

     protected double deposit(double amount) {
         balance = balance + amount;
         System.out.println("Balamce after deposit: "+balance);
         return balance;
     }

     protected double withdraw(double amount) {

         if(balance>=amount){
             balance=balance-amount;
             System.out.println("After withdrawing balance: "+balance);
         }
         else{
             System.out.println("no sufficient funds");
         }
         return balance;


     }

 }

    class SavingsAccount extends BankAccount{
     int year;
     int rateofinterest;
     double amount;
     double interest;
     public double interest(double amount,int year,int rateofinterest){
         interest=amount*year*rateofinterest/100;
         System.out.println("Interest:"+interest);
         return interest;

     }

    public static void main(String[] args) {
        SavingsAccount savingsAccount=new SavingsAccount();
        System.out.println("AccountNumber:"+savingsAccount.accountNumber);
        savingsAccount.deposit(110);
        savingsAccount.withdraw(10);
        savingsAccount.interest(1000,2,5);



    }

}
