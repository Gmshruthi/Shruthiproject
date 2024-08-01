package ControlFlowTask;

 class PrimeNumber {
  public static void main(String[] args) {
   int n = 484;
   int count = 0;
   for (int i = 2; i <= n; i++) {
    count = 0;

    for (int j = 2; j <= i; j++) {
     if (i % j == 0) {
      count++;
     }
    }
    if (count < 2) {
     System.out.println(i);
    }
   }
  }
 }





