package Module6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class StreamTimeModule {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        SimpleDateFormat date_format=new SimpleDateFormat("dd-MM-yyyy EEEE hh:mm:ss a");
        date_format.setTimeZone(timeZone);
        Date date = new Date();
        String current_date_time=date_format.format(date);
        System.out.println("GMT-"+current_date_time);

        timeZone = TimeZone.getTimeZone("Australia/Sydney");
        date_format.setTimeZone(timeZone);
        current_date_time=date_format.format(date);
        System.out.println("Australia/Sydney-"+current_date_time);

        timeZone = TimeZone.getTimeZone("Asia/Jakarta");
        date_format.setTimeZone(timeZone);
        current_date_time=date_format.format(date);
        System.out.println("Asia/Jakarta-"+current_date_time);

        timeZone = TimeZone.getTimeZone("Asia/Kolkata");
        date_format.setTimeZone(timeZone);
        current_date_time=date_format.format(date);
        System.out.println("Asia/Kolkata-"+current_date_time);

        timeZone = TimeZone.getTimeZone("Asia/Dubai");
        date_format.setTimeZone(timeZone);
        current_date_time=date_format.format(date);
        System.out.println("Asia/Dubai-"+current_date_time);

        timeZone = TimeZone.getTimeZone("Europe/London");
        date_format.setTimeZone(timeZone);
        current_date_time=date_format.format(date);
        System.out.println("Europe/London-"+current_date_time);

        timeZone = TimeZone.getTimeZone("America/Chicago");
        date_format.setTimeZone(timeZone);
        current_date_time=date_format.format(date);
        System.out.println("America/Chicago-"+current_date_time);

        timeZone = TimeZone.getTimeZone("America/New_York");
        date_format.setTimeZone(timeZone);
        current_date_time=date_format.format(date);
        System.out.println("America/New_York-"+current_date_time);
    }
}
