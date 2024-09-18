package Git.src.practise.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HighestAndLowestKey {
    public static void main(String[] args) {
        HashMap<String,Integer> Map=new HashMap<>();
        Map.put("Z",10);
        Map.put("B",2);
        Map.put("C",3);
        Map.put("W",4);
        System.out.println("MAX KEY:"+Collections.max(Map.keySet()));
        System.out.println("MIN KEY:"+Collections.min(Map.keySet()));
    }
}
