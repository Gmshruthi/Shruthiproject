package Git.src.practise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ValidEmailId {
        public boolean isValidEmail(String email) {
            String regex = "^[^@]+@[^@]+\\.[^@\\.]+$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ValidEmailId emailRegex = new ValidEmailId();
            String email = scanner.next();
            if (emailRegex.isValidEmail(email)) {
                System.out.println("Valid");
            } else System.out.println("Invalid");
        }
    }

