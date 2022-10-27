package Module15;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class AmountFormatting implements Amount{
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("enter you country and money");
        String country = obj.nextLine();
        BigDecimal money = obj.nextBigDecimal();
        UK uk = new UK();
        US us = new US();
        India india = new India();
if(country.equals("UK")) {
    System.out.println(UK.getFormattedDisplayAmount(money));
}
else if(country.equals("US")){
    System.out.println(US.getFormattedDisplayAmount(money));
}
else if (country.equals("French")){
    System.out.println(French.getFormattedDisplayAmount(money));

}
else {
    System.out.println(India.getFormattedDisplayAmount(money));
}

    }
}
