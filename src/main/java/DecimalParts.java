import java.math.BigDecimal;

//Returning Decimal parts of a num
public class DecimalParts {

    public static BigDecimal decimalPrint(float num) {

        float decimal = 0;

        return new BigDecimal(num % 1);

    }


}
