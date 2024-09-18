package Git.src.practise.Collections;

import java.util.LinkedHashSet;

public class EmptyLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(4);
        System.out.println(linkedHashSet);
        linkedHashSet.clear();
        System.out.println(linkedHashSet);
    }
}
