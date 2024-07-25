 class BankAccount {
    private String accountNumber;
    private double balance;

     public double getBalance() {
         return balance;
     }

     public void setBalance(double balance) {
         this.balance = balance;
         System.out.println("initial bal:"+balance);
     }

     public String getAccountNumber() {
         return accountNumber;
     }

     public void setAccountNumber(String accountNumber) {
         this.accountNumber = accountNumber;
     }
     public double deposit(double amount){
         if(amount>0)
         {
             balance+=amount;
             System.out.println("sucessfully added:"+balance);
         }
         else{
             System.out.println("invalid amount");
         }
         return amount;
     }
     public double withdraw(double amount){
         if(balance>=amount){
             balance=balance-amount;
             System.out.println("After withdrawing balance:"+balance);
         }
         else{
             System.out.println("no sufficient funds");
         }
         return amount;
     }
 }
