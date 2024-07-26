package ControlFlowTask;

 class SumOfEvenNos {
     public static void main(String args[]) {
         int sum = 0;
         int i;
         for(i=1;i<25;i++){
             if(i%2==0){
                 sum=sum+i;
             }
         }
         System.out.println("Sum of even numbers:"+sum);

     }
 }
