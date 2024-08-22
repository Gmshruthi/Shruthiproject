package Git.src.practise;
import java.util.Scanner;
public class IncreasingOrDecreasingOrder {
    public String increasingOrDecreasingOrder(int number1,int number2,int number3){
        if(number1<number2 && number2<number3){
            return "In increasing order";
        }
        else if(number1>number2 && number2>number3){
            return "In decreasing order";
        }
        else{
            return "Neither in increasing nor decreasing order";
        }
    }
        public static void main(String[] args) {
        IncreasingOrDecreasingOrder increasingOrDecreasingOrder=new IncreasingOrDecreasingOrder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the three numbers: ");
        int number1=scanner.nextInt();
        int number2=scanner.nextInt();
        int number3=scanner.nextInt();
        System.out.println(increasingOrDecreasingOrder.increasingOrDecreasingOrder(number1,number2,number3));
        }
    }

