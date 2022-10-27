package Module14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) {


    Date date = new Date();
    SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
    String stringFormatDate = format.format(date);
    System.out.println("Date Format with MM/dd/yyyy : "+stringFormatDate);


    format = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
    stringFormatDate = format.format(date);
                    System.out.println("Date Format with dd-M-yyyy hh:mm:ss : "+stringFormatDate);


    format = new SimpleDateFormat("dd MMMM yyyy");
    stringFormatDate = format.format(date);
                    System.out.println("Date Format with dd MMMM yyyy : "+stringFormatDate);


    format = new SimpleDateFormat("dd MMMM yyyy zzzz");
    stringFormatDate = format.format(date);
                    System.out.println("Date Format with dd MMMM yyyy zzzz : "+stringFormatDate);


    format = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
    stringFormatDate = format.format(date);
                    System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z :"+stringFormatDate);
}
}