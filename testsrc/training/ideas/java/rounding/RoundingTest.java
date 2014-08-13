package training.ideas.java.rounding;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idndde on 8/10/2014.
 */
public class RoundingTest {

    @Test
    public void round_ceil_if_number_11_21()
    {
        double inputnumber=11.21;
        double expectednumber = 11.25;
        Assert.assertEquals(expectednumber,Rounding.RoundCalc(inputnumber),0.0);
    }

    @Test
    public void round_ceil_if_number_11_25()
    {
        double inputnumber=11.25;
        double expectednumber = 11.25;
        Assert.assertEquals(expectednumber,Rounding.RoundCalc(inputnumber),0.0);
    }

    @Test
         public void round_ceil_if_number_11_26()
    {
        double inputnumber=11.26;
        double expectednumber = 11.30;
        Assert.assertEquals(expectednumber,Rounding.RoundCalc(inputnumber),0.0);
    }

    @Test
    public void round_ceil_if_number_11_99()
    {
        double inputnumber=11.99;
        double expectednumber = 12.00;
        Assert.assertEquals(expectednumber,Rounding.RoundCalc(inputnumber),0.0);
    }

    @Test
    public void round_ceil_if_number_19_99()
    {
        double inputnumber=19.99;
        double expectednumber = 20.00;
        Assert.assertEquals(expectednumber,Rounding.RoundCalc(inputnumber),0.0);
    }
}
