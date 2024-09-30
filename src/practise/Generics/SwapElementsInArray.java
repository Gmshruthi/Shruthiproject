package Git.src.practise.Generics;

import java.util.Arrays;

public class SwapElementsInArray {
    public <T> void swap(T[] array,int index1, int index2){
        T temp =array[index1];
        array[index1]= array[index2];
        array[index2]= temp;
    }
    public static void main(String[] args) {
        SwapElementsInArray swapElementsInArray=new SwapElementsInArray();
        Integer[] intArray = {1, 2, 3, 4, 5};
        swapElementsInArray.swap(intArray, 1, 3);
        System.out.println("After swapping: " + Arrays.toString(intArray));
    }
}
