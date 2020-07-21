import java.math.BigDecimal;

//counts the number of digit of a number
public class LongNumberDigitsCounter {

    public static long longCounter(long num) {

        long length = 0;
        length = String.valueOf(new BigDecimal(num)).length();
        return length;
    }
}
