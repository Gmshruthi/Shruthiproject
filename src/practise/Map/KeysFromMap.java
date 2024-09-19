package Git.src.practise.Map;

import java.util.TreeMap;

public class KeysFromMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> treeMap=new TreeMap<>();
        treeMap.put("A",1);
        treeMap.put("B",2);
        treeMap.put("C",3);
        treeMap.put("W",4);
        System.out.println(treeMap.keySet());
    }
}
