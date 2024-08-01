package ControlFlowTask;

 class Palindrome {
  public static void main(String args[]){
   String p="JAVA";
   String rev="";
   for(int i=p.length()-1;i>=0;i--) {
    rev = rev + p.charAt(i);
   }
   if(p==rev){
    System.out.println("Given String is palindrome");
   }
   else{
    System.out.println("Not a palindrome");
   }


  }
 }
