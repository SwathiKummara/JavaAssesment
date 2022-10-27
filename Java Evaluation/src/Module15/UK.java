package Module15;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class UK implements Amount {
    static BigDecimal amount;
    public static void setAmount(BigDecimal amount) {
        UK.amount = amount;
    }
    
    public static BigDecimal getAmount() {
        return amount;
    }

    static String getFormattedDisplayAmount(BigDecimal amount) {
        NumberFormat UKFormat = NumberFormat.getCurrencyInstance(Locale.UK);
          return UKFormat.format(amount);
    }

}
