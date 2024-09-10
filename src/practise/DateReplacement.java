package Git.src.practise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateReplacement{
    public String replaceDates(String text){
        String dateRegex="(\\d{2})/(\\d{2})/(\\d{4})";
        String replaceRegex = "$3-$2-$1";
        Pattern pattern=Pattern.compile(dateRegex);
        Matcher matcher=pattern.matcher(text);
        return matcher.replaceAll(replaceRegex);
    }

    public static void main(String[] args) {
        DateReplacement dateReplacement=new DateReplacement();
        Scanner scanner=new Scanner(System.in);
        String text= scanner.nextLine();
        System.out.println(dateReplacement.replaceDates(text));
    }
}





