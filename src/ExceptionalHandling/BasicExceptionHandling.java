package Git.src.ExceptionalHandling;

public class BasicExceptionHandling {
     public static void division(int divident,int divisor){
         System.out.println(divident/divisor);
         }

    public static void main(String[] args) {


        try{
            division(12,0);
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }

    }
}
