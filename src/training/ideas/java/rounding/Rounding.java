package training.ideas.java.rounding;

/**
 * Created by idndde on 8/10/2014.
*/
public class Rounding {
    public static double RoundCalc(double inputnumber) {

        inputnumber=(Math.ceil(inputnumber*20))/20;
        return inputnumber;
    }
}
