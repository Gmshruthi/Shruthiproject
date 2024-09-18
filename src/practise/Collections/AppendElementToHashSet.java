package Git.src.practise.Collections;

import java.util.HashSet;
import java.util.Scanner;

public class AppendElementToHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set =new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        Scanner scanner=new Scanner(System.in);
        int element= scanner.nextInt();
        if(element>4){
            set.add(element);
            System.out.println("original set:"+set);
        }
        else
            System.out.println("Enter greater than 4");
    }
}
