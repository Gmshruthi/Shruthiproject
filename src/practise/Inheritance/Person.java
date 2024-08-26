package Git.src.practise.Inheritance;

import Git.src.practise.Contact;

import java.time.LocalDate;
import java.time.Period;

public class Person extends Contact {
    public LocalDate DateOfBirth=LocalDate.of(1990, 5, 15);
    public int calculateAge(){
        LocalDate curDate = LocalDate.now();
        if ((DateOfBirth != null) && (curDate != null))
        {
            return Period.between(DateOfBirth, curDate).getYears();
        }
        return 0;
    }
}
