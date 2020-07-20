public class Main {

    public static void main(String[] args) {

        CalculateFactorials fac = new CalculateFactorials();
        System.out.println(fac.calcfactorial(5));

        CalculateMaximum max = new CalculateMaximum();
        System.out.println(max.calcMaximum(912));

        IsPrime pr = new IsPrime();
        System.out.println(pr.isPrime(4));

        HarmonicSum hsum = new HarmonicSum();
        System.out.println(hsum.harmonicSum(432));

        LongNumberDigitsCounter cs = new LongNumberDigitsCounter();
        System.out.println(cs.longCounter(10000000000000000L));

        DecimalParts dp = new DecimalParts();
        System.out.println(dp.decimalPrint((float) 6.3394932952349));


    }
}
