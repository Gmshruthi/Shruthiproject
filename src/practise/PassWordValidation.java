package Git.src.practise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PassWordValidation {
     boolean isValidPassword(String input){
        String Regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[\\W_]).{12}$";
        Pattern pattern= Pattern.compile(Regex);
        Matcher matcher= pattern.matcher(input);
        int[] count= new int[15];
        if(matcher.matches()){
            for(int i=0;i<input.length();i++) {
                for (int j =0; j<input.length();j++) {
                    if (input.charAt(i)==input.charAt(j)) {
                        count[i]++;
                    }
                }
            }
        }
        for(int i=0;i<input.length();i++){
            if(count[i]==1)
                return true;
        }
        return false;

    }
    public static void main(String[] args) {
         PassWordValidation passWordValidation=new PassWordValidation();
        Scanner scanner=new Scanner(System.in);
        String input= scanner.next();
        if(passWordValidation.isValidPassword(input)){
            System.out.println("Valid");
        }
        else System.out.println("Invalid");
    }
}
