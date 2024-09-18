package Git.src.practise.Collections;

import java.util.ArrayList;

public class IterateArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        int i=0;
        while(list.size()>i){
            System.out.println(list.get(i));
            i++;
        }
    }
}
