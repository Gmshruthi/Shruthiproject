package ControlFlowTask;

 class Factorial {
     public static void main(String args[])
     {
         int n=4;
         int fact=1;
         for(int i=0;i<n;i++){
             fact=fact+fact*i;
         }
         System.out.println("Factorial of 4 is:"+fact);
     }
}
