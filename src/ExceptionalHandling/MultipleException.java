package Git.src.ExceptionalHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleException {
    public void Division(int dividend,int divisor){
        System.out.println("Answer:"+dividend/divisor);
    }
    public static void main(String[] args) {
        MultipleException multipleException=new MultipleException();
        try{
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter a dividend to divide:");
            int divident= scanner.nextInt();
            System.out.println("Enter a divisor to divide:");
            int divisor= scanner.nextInt();
            multipleException.Division(divident,divisor);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch(InputMismatchException ex){
            System.out.println("Invalid Input");
        }
    }
}
