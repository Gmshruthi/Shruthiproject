package Git.src.practise.Map;

import java.util.HashMap;

public class AssociateValueWithKey {
    public static void main(String[] args) {
        HashMap<String,Integer> Map=new HashMap<>();
        Map.put("A",1);
        Map.put("B",2);
        Map.put("C",3);
        Map.put("W",4);
        System.out.println("MAP:"+Map);
    }
}
