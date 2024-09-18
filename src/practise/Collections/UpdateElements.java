package Git.src.practise.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UpdateElements {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        array.add(2);
        array.add(6);
        array.add(4);
        array.add(10);
        UpdateElements updateElements = new UpdateElements();
        Iterator itr= array.iterator();
        System.out.println("Enter the element to be replaced:");
        int value = scanner.nextInt();
        System.out.println("Enter the replacement element:");
        int replace= scanner.nextInt();
        int i= array.indexOf(value);
        array.set(i, replace);
        System.out.println(array);
    }
    }
