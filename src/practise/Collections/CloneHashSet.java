package Git.src.practise.Collections;

import java.util.HashMap;
import java.util.HashSet;

public class CloneHashSet {
    public static void main(String[] args) {
        HashSet<String> Set=new HashSet<>();
        Set.add("a1");
        Set.add("b");
        Set.add("c");
        Set.add("d");
        HashSet copy = (HashSet)Set.clone();
        System.out.println(copy);
    }
}
