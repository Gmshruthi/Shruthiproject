package Git.src.practise;

import java.util.*;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Set<Integer> boxA=new HashSet<>(Arrays.asList(8, 9, 10, 11, 12, 13, 14, 15));
        Set<Integer> boxB=new HashSet<>(Arrays.asList(4, 5, 6, 7, 12, 13, 14, 15));
        Set<Integer> boxC=new HashSet<>(Arrays.asList(2, 3, 6, 7, 10, 11, 14, 15));
        Set<Integer> boxD=new HashSet<>(Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15));
        Set<Integer>[] boxes=new Set[]{boxA, boxB, boxC, boxD};
        Scanner scanner=new Scanner(System.in);
        Set<Integer> possibleNumbers= new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
        for(int i=0;i< boxes.length;i++) {
            System.out.println("Is the number in box " + (char) ('A' + i) + "(Yes/No)");
            String Input = scanner.nextLine().trim().toLowerCase();
            switch (Input) {
                case "yes":
                    possibleNumbers.retainAll(boxes[i]);
                    break;
                case "no":
                    possibleNumbers.removeAll(boxes[i]);
                    break;
                default:
                    System.out.println("invalid input");
            }
        }
            if(possibleNumbers.size()==1)
            {
                System.out.println("The number you were thinking : " +possibleNumbers.iterator().next());
            }
            else
            {
                System.out.println("Could not find the number");
            }
        }
    }


