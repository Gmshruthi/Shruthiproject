package Git.src.ExceptionalHandling;

public class ExceptionPropagation {
    public static int Squareroot(int number){
        System.out.println("Square root of Given Number: "+Math.sqrt(number));
        return number;
    }

    public static void main(String[] args) {

        try {
            int number=-9;
            Squareroot(-9);
            if(number<0){
                throw new IllegalArgumentException();
            }


        } catch (IllegalArgumentException exc) {
            System.out.println("No negative numbers");
        }



    }
}


