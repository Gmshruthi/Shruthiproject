package Git.src.practise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExtraction {
    public  String extractPhoneNumbers(String Text){
        Pattern pattern=Pattern.compile("\\(?\\+?\\d{2}\\)?\\s?\\d{5}-\\d{5}|\\d{3}-\\d{3}-\\d{4}");
        Matcher matcher=pattern.matcher(Text);
        if(matcher.find())
            return matcher.group();
        return null;
    }
    public static void main(String[] args) {
        PhoneNumberExtraction phoneNumberExtraction=new PhoneNumberExtraction();
        Scanner scanner = new Scanner(System.in);
        String Text = scanner.nextLine();
        System.out.println(phoneNumberExtraction.extractPhoneNumbers(Text));
    }
}
