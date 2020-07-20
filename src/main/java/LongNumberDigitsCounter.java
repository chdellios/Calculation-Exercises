import java.math.BigDecimal;

public class LongNumberDigitsCounter {

    public static long longCounter(long num) {

        long lenght = 0;
        lenght = String.valueOf(new BigDecimal(num)).length();
        return lenght;
    }
}
