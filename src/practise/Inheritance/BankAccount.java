package Git.src.practise.Inheritance;

 class BankAccount {
     protected int accountNumber = 123456;
     protected double balance = 1261;
     double amount;

     protected double deposit(double amount) {
         balance = balance + amount;
         System.out.println("Balamce after deposit: "+balance);
         return amount;
     }

     protected double withdraw(double amount) {

         if(balance>=amount){
             balance=balance-amount;
             System.out.println("After withdrawing balance: "+balance);
         }
         else{
             System.out.println("no sufficient funds");
         }
         return amount;


     }

 }

class SavingsAccount extends BankAccount{
     float interestRate;
     public void interest(){

     }
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        System.out.println("AccountNumber:"+bankAccount.accountNumber);
        bankAccount.deposit(1);
        bankAccount.withdraw(10);


    }

}
