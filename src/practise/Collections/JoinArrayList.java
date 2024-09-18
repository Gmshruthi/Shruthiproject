package Git.src.practise.Collections;

import java.util.ArrayList;

public class JoinArrayList {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Cricket");
        list1.add("football");
        list1.add("badminton");
        System.out.println("List 1:" + list1);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Swimming");
        list2.add("Baseball");
        list2.add("Tennis");
        System.out.println("List 2:" + list2);
        list1.addAll(list2);
        System.out.println(list1);
    }
}
