package Git.src.practise.Collections;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedHashSetToArray {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(4);
        Integer[] array=linkedHashSet.toArray(new Integer[0]);
        System.out.println("arrays:"+ Arrays.toString(array));
    }
}
