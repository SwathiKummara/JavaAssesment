package Module7;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DaysRemainingForbday {
    public static void main(String[] args) {

        var today = LocalDate.now();
        LocalDate birthday;
        birthday = LocalDate.of(2001, Month.SEPTEMBER, 20);

        LocalDate nextBDay = birthday.withYear(today.getYear());

        //If birthday has occurred this year already, add 1 to the year.
        if (nextBDay.isBefore(today) || nextBDay.isEqual(today)) {
            nextBDay = nextBDay.plusYears(1);
        }

        long days = ChronoUnit.DAYS.between(today, nextBDay);
        System.out.println("There are " +
                days + " days Remaining for your birth day");
    }
}
