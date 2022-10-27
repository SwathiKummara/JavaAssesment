package Module15;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class French implements Amount {
    static BigDecimal amount;
    public static void setAmount(BigDecimal amount) {
        UK.amount = amount;
    }

    public static BigDecimal getAmount() {
        return amount;
    }
    static String getFormattedDisplayAmount(BigDecimal amount) {
        NumberFormat frenchFormat = NumberFormat.getCurrencyInstance(Locale.FRENCH);
        return frenchFormat.format(amount);
    }

}
