package Git.src.ExceptionalHandling;

import java.util.Scanner;

public class InvalidAgeException extends Exception  {
    public InvalidAgeException(){
        super("Not valid");
    }
    public int ageEligibility(int Age){
        System.out.println("Valid Age");
        return Age;
    }
    public static void main(String[] args) {
        InvalidAgeException invalidAgeException=new InvalidAgeException();

        try {
            Scanner scanner=new Scanner(System.in);
            int Age= scanner.nextInt();
            System.out.println("Enter Age:");
            if ((Age>125)) {

                throw new InvalidAgeException();


            }
            invalidAgeException.ageEligibility(Age);

        }
        catch (InvalidAgeException ex){
            System.out.println(ex.getMessage());
        }

    }
}


