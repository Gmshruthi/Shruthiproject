package Git.src.ExceptionalHandling;

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
            int Age=129;
            if ((Age>125)) {

                throw new InvalidAgeException();


            }
            invalidAgeException.ageEligibility(129);

        }
        catch (InvalidAgeException ex){
            System.out.println(ex.getMessage());
        }

    }
}


