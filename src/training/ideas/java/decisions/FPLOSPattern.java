package training.ideas.java.decisions;

/**
 * Created by idndde on 7/25/2014.
 */
public class FPLOSPattern {
    public static String generateFPLOSPattern(double[] rateValue, double[] lrvForSevenDays) {
        String fplosPattern = "";
        double sumOfRateValue = 0.0;
        double sumOfLRV = 0.0;
        for (double lrvForIndividualLOS : lrvForSevenDays) {
            for(double rateForIndividuals: rateValue) {
                sumOfRateValue += rateForIndividuals;
                sumOfLRV += lrvForIndividualLOS;
                if (sumOfRateValue >= sumOfLRV)
                    fplosPattern += "Y";
                else {
                    fplosPattern += "N";
                }
            }
        }
       /* for (int i = 0; i < lrvForSevenDays.length; i++) {
            if(lrvForSevenDays[i] <= rateValue[i])
                fplosPattern += "Y";
            else
                fplosPattern += "N";
        }
        */
        return fplosPattern;

    }

}
