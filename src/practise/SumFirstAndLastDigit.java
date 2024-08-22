package Git.src.practise;
import java.util.Scanner;
public class SumFirstAndLastDigit {
    public static void sumOfFirstAndLastDigit(int number) {
        int remainder;
        int number1=number;
        int sum=0;
        if(number1<10 && number1>0) {
            sum=number1+number1;
            System.out.println(sum);
        }
        if(number1<0){
            System.out.println("-1");
        }
        while(number1>=10){
            number1=number1/10;
            remainder=number%10;
            sum=number1+remainder;
            System.out.println(sum);
        }
        }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;
        System.out.println("Enter Input:");
        number=scanner.nextInt();
        sumOfFirstAndLastDigit(number);
    }
    }
