package training.ideas.java.decisions;

/**
 * Created by idndde on 7/24/2014.
 */
public class FPLOSCalculator {
    public static String generateFPLOSPattern(double rateValue, double[] lrvForSevenDays) {
        String fplosPattern = "";
        double sumOfRateValue = 0.0;
        double sumOfLRV = 0.0;
        for (double lrvForIndividualLOS : lrvForSevenDays) {
            sumOfRateValue += rateValue;
            sumOfLRV += lrvForIndividualLOS;
            if (sumOfRateValue >= sumOfLRV)
                fplosPattern += "Y";
            else {
                fplosPattern += "N";
            }
        }
        return fplosPattern;

    }


}

