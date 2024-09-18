package Git.src.practise.Collections;

import java.util.HashMap;

public class CloneHashSet {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        HashMap copy = (HashMap)map.clone();
        copy.remove("a");
        System.out.println(copy);
    }
}
