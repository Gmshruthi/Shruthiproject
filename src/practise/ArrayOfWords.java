package Git.src.practise;

import java.util.Scanner;

public class ArrayOfWords {
    public static void main(String[] args) {
        String[] words = {"apple", "application", "banana", "appreciate", "pineapple"};
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter first two and last two letters: ");
        String firstTwoLetters=scanner.nextLine();
        String LastTwoLetters=scanner.nextLine();
        if ((firstTwoLetters.length() != 2 || LastTwoLetters.length() != 2)) {
            System.out.println("Not matching");
        }else{
        for (int i=0;i< words.length;i++) {
            if (words[i].startsWith(firstTwoLetters) && words[i].endsWith(LastTwoLetters)) {
                System.out.println(words[i]);
            }
        }
    }
    }
}

