package Git.src.practise.Map;

import java.util.HashMap;
import java.util.Map;

public class RemoveMaps {
    public static void main(String[] args) {
        HashMap<String,Integer> Map=new HashMap<>();
        Map.put("A",1);
        Map.put("B",2);
        Map.put("C",3);
        Map.put("W",4);
        System.out.println("Before Removing Maps:"+Map);
        Map.clear();
        System.out.println("After removing Maps:"+Map);
    }
}
