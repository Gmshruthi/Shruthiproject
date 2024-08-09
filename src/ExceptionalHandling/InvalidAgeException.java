package Git.src.ExceptionalHandling;

import java.util.Scanner;

public class InvalidAgeException extends Exception  {
    public InvalidAgeException(){
        super("Not valid");
    }
    public void ageEligibility(int Age){
        System.out.println("Valid Age");
    }
    public static void main(String[] args) {
        InvalidAgeException invalidAgeException=new InvalidAgeException();
        try {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter Age:");
            int Age= scanner.nextInt();
            if ((Age<0 || Age>120)) {
                throw new InvalidAgeException();
            }
            else{
            invalidAgeException.ageEligibility(Age);
            }
        }
        catch (InvalidAgeException ex){
            System.out.println(ex.getMessage());
        }

    }
}


