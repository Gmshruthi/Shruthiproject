package Git.src.practise.Collections;

import java.util.HashSet;

public class RemoveHashSet {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("welcome");
        set.add("to");
        set.add("java");
        set.add("programming");
        System.out.println("original set:"+set);
        set.clear();
        System.out.println(set);
    }
}
