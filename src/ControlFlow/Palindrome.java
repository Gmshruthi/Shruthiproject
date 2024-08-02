package ControlFlowTask;

 class Palindrome {
  public static void main(String args[]) {
   String[] p = {"racecar", "man", "madam", "question"};
   String rev;
   char ch;
   int i, j;
   for (i = 0; i < 4; i++) {
    rev = "";
    for (j = 0; j < p[i].length(); j++) {
     ch = p[i].charAt(j);
     rev = ch + rev;
    }
    if (p[i].equals(rev)) {
     System.out.println(p[i] + " is a palindrome");
    }
   }
  }
 }
