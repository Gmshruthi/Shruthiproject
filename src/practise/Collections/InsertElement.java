package Git.src.practise.Collections;

import java.util.LinkedList;

public class InsertElement {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(12);
        linkedList.add(13);
        linkedList.add(5);
        System.out.println("Original set:"+linkedList);
        linkedList.addFirst(1);
        System.out.println("After Adding:"+linkedList);
    }
}
