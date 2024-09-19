package Git.src.practise.Collections;

import java.util.HashSet;

public class CompareSets {
    public static void main(String[] args) {
        HashSet<Integer> set1 =new HashSet<>();
        HashSet<Integer> set2 =new HashSet<>();
        set1.add(11);
        set1.add(12);
        set1.add(13);
        System.out.println("SET 1: "+set1);
        set2.add(20);
        set2.add(12);
        set2.add(13);
        set2.add(40);
        System.out.println("SET 2: "+set2);
        set1.retainAll(set2);
        System.out.println("COMMON ELEMENTS:"+set1);

    }
}
