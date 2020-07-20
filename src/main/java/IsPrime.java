import java.util.ArrayList;

public class IsPrime {


    public static boolean isPrime(int n) {
        int upto = (int) (Math.sqrt(n) + 1);
        if (n == 2)
            return true;
        if (n % 2 == 0)//
            return false;
        for (int j = 1; j < upto; j += 2) {
            if (n % j == 0)
                return false;
        }
        return true;
    }
}
