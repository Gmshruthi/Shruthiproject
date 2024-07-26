package ControlFlowTask;

 class LeapYear {
     public static void main(String args[]){
         int year=2020;
         if(year%4==0 && year%100!=0){
             System.out.println("Given year is leap year");
         }
         else{
             System.out.println("Not a leap year");
         }
     }

}
