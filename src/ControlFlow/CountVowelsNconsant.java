package ControlFlowTask;

 class CountVowelsNconsant {
     public static void main(String args[]) {
         String[] array = {"Apple", "ball", "collection", "meeting"};
         int i, j;


         //int n=fruits.length();
         for (i = 0; i < 4; i++) {
             int countVowels=0;
             int countConstants=0;


             for (j = 0; j < array[i].length(); j++)
                 if (array[i].charAt(j) == 'a' || array[i].charAt(j) == 'A' || array[i].charAt(j) == 'e' || array[i].charAt(j) == 'E' || array[i].charAt(j) == 'I' || array[i].charAt(j) == 'i' || array[i].charAt(j) == 'o' || array[i].charAt(j) == 'O' || array[i].charAt(j) == 'u' || array[i].charAt(j) == 'U') {
                     countVowels++;


                 }
             else{
                 countConstants++;
                 }
             System.out.println(array[i]+" has "+countVowels+" vowels"+" "+countConstants+" Constants");


         }




     }
 }
