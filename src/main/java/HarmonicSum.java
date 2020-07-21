public class HarmonicSum {
    //Calculating the harmonic sum
    public static double harmonicSum(int n) {
        double returnValue = 0;
        for (int i = 1; i <= n; i++) {
            returnValue += 1 / (double) i;
        }
        return returnValue;
    }

}
