package ControlFlowTask;

 class LargestASmallest {
  public static void main(String[] args) {
   int[] numbers={23,90,34,678,199};
   int i,j,t;
   for(i=0;i<numbers.length;i++){
    for(j=0;j<numbers.length;j++){
     if(numbers[i]<numbers[j]){
      t=numbers[i];
      numbers[i]=numbers[j];
      numbers[j]=t;


     }
    }

   }
   System.out.println("Smallest number :"+numbers[0]);
   System.out.println("Largest number :"+numbers[i-1]);
  }
 }
