package Git.src.ExceptionalHandling;

import java.util.Scanner;

public class ExceptionPropagation {
    public int Squareroot(int number){
        System.out.println("Square root of Given Number: "+Math.sqrt(number));
        return number;
    }

    public static void main(String[] args) {
        ExceptionPropagation exceptionPropagation=new ExceptionPropagation();

        try {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter A Number:");
            int number= scanner.nextInt();
            if(number<0){
                throw new IllegalArgumentException();
            }
            exceptionPropagation.Squareroot(number);



        } catch (IllegalArgumentException exc) {
            System.out.println("No negative numbers");
        }



    }
}


