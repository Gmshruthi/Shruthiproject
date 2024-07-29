package ControlFlowTask;

 class CountVowelsNconsant {
  public static void main(String args[]){
   String fruits="Bannana";
   int i;
   int n=fruits.length();
   int countVowels=0;
   int countConsants=0;
   for(i=0;i<n;i++){
    if(fruits.charAt(i)=='a' || fruits.charAt(i)=='A'|| fruits.charAt(i)=='e' || fruits.charAt(i)=='E' || fruits.charAt(i)=='I' || fruits.charAt(i)=='i' || fruits.charAt(i)=='o' || fruits.charAt(i)=='O' || fruits.charAt(i)=='u' || fruits.charAt(i)=='U'){
     countVowels=countVowels+1;
    }
    else{
     countConsants=countConsants+1;
    }
   }
   System.out.println("No Of Vowels:"+countVowels);
   System.out.println("No of Consants:"+countConsants);

  }
 }
