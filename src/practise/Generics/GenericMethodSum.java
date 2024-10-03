package Git.src.practise.Generics;

import java.util.Scanner;

public class GenericMethodSum {
    public <T extends Number> void sum(T number1,T number2){
        System.out.println(number1.intValue()+ number2.intValue());
        System.out.println(number1.doubleValue()+ number2.doubleValue());
    }
    public static void main(String[] args) {
        GenericMethodSum genericMethodSum=new GenericMethodSum();
        genericMethodSum.sum(10.00,11.67);
    }
}
