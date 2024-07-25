import java.util.Scanner;

import java.util.Scanner;
public class Arithmeticop {
    public static void main(String args[]){
        int a,b;
        String operation;
        System.out.println("1.Addition");
        System.out.println("2.Subraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a=sc.nextInt();
        System.out.println("Enter the value of b:");
        b=sc.nextInt();
        System.out.println("Select your operation:");
        operation=sc.next();
        switch (operation){
            case "add":
                System.out.println("Addition of two numbers:"+(a+b));
                break;
            case "sub":
                System.out.println("Subraction of two numbers:"+(a-b));
                break;
            case "mul":
                System.out.println("Multiplication of two numbers:"+(a*b));
                break;
            case "div":
                System.out.println("Division of two numbers:"+(a*b));
                break;



        }

    }
}
