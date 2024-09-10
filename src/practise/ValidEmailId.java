package Git.src.practise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ValidEmailId {
    public static boolean isValidEmail(String email) {
        String Regex="^([a-zA-Z]+)@(.+)\\.(.+)$";
        if(email.matches(Regex))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String email= scanner.next();
        System.out.println(isValidEmail(email));
    }
}
