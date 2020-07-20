public class CalculateFactorials {
    //Calculate factorial
    public static int calcfactorial(int n) {
        int returnValue = 1;
        for (int i = 1; i <= n; i++) {
            returnValue *= i;
            System.out.println(i + returnValue);
        }
        return returnValue;
    }

}
