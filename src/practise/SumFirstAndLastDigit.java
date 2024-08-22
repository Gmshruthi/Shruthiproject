package Git.src.practise;
import java.util.Scanner;
public class SumFirstAndLastDigit {
    public int sumOfFirstAndLastDigit(int number) {
        int remainder;
        int number1 = number;
        int sum = 0;
        if(number1 < 10 && number1 > 0) {
            sum = number1 + number1;
            return sum;
        }
        if(number1 < 0) {
            return -1;
        }
        while (number1 >= 10) {
            number1 = number1 / 10;
        }
            remainder = number % 10;
            sum = number1 + remainder;
            return sum;
    }
    public static void main(String[] args) {
        SumFirstAndLastDigit sumFirstAndLastDigit=new SumFirstAndLastDigit();
        Scanner scanner=new Scanner(System.in);
        int number;
        System.out.println("Enter Input:");
        number=scanner.nextInt();
        System.out.println(sumFirstAndLastDigit.sumOfFirstAndLastDigit(number));
    }

    }
