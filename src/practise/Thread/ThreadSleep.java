package Git.src.practise.Thread;

import java.util.Scanner;

public class ThreadSleep {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the time to sleep:");
        int time= scanner.nextInt();
        int i;
        for( i=1;i<=5;i++) {
            Thread.sleep(time);
            System.out.println("Welcome to Thread :"+i);
        }
    }
}
