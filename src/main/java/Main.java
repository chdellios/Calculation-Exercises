import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
/**
 * This is the Main class that executes each Class(exercise)
 */

//Calculating Factorial of a number
        CalculateFactorials fac = new CalculateFactorials();
        System.out.println("The Factorial of number 5 is");
        System.out.println(fac.calcFactorial(5));

        System.out.println("-----------------------");

        //Calulating Maximum value of an integer
        CalculateMaximum max = new CalculateMaximum();
        System.out.println("The maximum value of 912 is: ");
        System.out.println(max.calcMaximum(912));

        System.out.println("-----------------------");

        //Checking if a number is prime
        IsPrime pr = new IsPrime();
        System.out.println("Is number 5 prime ?");
        System.out.println(pr.isPrime(5));

        System.out.println("-----------------------");

        //Calculating the Harmonic sum of a number
        HarmonicSum hsum = new HarmonicSum();
        System.out.println("The harmonic sum of the number 432 is :");
        System.out.println(hsum.harmonicSum(432));

        System.out.println("-----------------------");

        //Counts the number of digits of a long number
        LongNumberDigitsCounter cs = new LongNumberDigitsCounter();
        System.out.println("The number of digits of the number 10000896570000000 are :");
        System.out.println(cs.longCounter(10000896570000000L));

        System.out.println("-----------------------");

        //Printing the decimal part of a number
        DecimalParts dp = new DecimalParts();
        System.out.println("The decimal parts of the number 6.3394932952349 are :");
        System.out.println(dp.decimalPrint((float) 6.3394932952349));
    }
}
