package Git.src.practise.Collections;

import java.util.ArrayList;

public class CompareArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1=new ArrayList<>();
        ArrayList<Integer> arrayList2=new ArrayList<>();
        arrayList1.add(10);
        arrayList1.add(12);
        arrayList1.add(13);
        System.out.println("List1:"+arrayList1);
        arrayList2.add(10);
        arrayList2.add(12);
        arrayList2.add(0);
        System.out.println("List2:"+arrayList2);
        if(arrayList1.equals(arrayList2)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}
