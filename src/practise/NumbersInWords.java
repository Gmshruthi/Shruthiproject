package Git.src.practise;

import java.util.Scanner;

public class NumbersInWords {

    public static void numberToWords(int number) {
        String[] one = {"", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        if (number == 0) {
            System.out.print("zero");
        }
        if (number / 100000 != 0) {
            System.out.print(one[(number / 100000) % 100] + " lakh ");
            number %= 100000;
        }
        if (number / 1000 != 0) {
            if (number / 1000 < 19) {
                System.out.print(one[number / 1000] + " thousand ");
            } else {
                System.out.print(tens[(number / 1000) / 10] + " ");
                if ((number / 1000) % 10 != 0) {
                    System.out.print(one[(number / 1000) % 10] + " ");
                }
                System.out.print("thousand ");
            }
            number %= 1000;
        }
        if (number / 100 != 0) {
            System.out.print(one[number / 100] + " hundred ");
            number %= 100;
        }
        if (number < 19) {
            System.out.print(one[number]);
        } else {
            System.out.print(tens[number / 10] + " ");
            if (number % 10 != 0) {
                System.out.print(one[number % 10]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int numberInput = scanner.nextInt();

        if (numberInput >= 0 && numberInput <= 100000) {
            numberToWords(numberInput);
        } else {
            System.out.println("Invalid input");
        }
    }
}


