package training.ideas.java.decisions;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idndde on 7/25/2014.
 */
public class FPLOSCalculatorTest {
    @Test
    public void given_rate_is_0_and_lrv_is_greater_then_fplos_pattern_should_be_NNNNNNN(){
        double ratevalue=0.0;
        double lrvForSevenDays[]={40.0,55.0,65.0,75.0,80.0,30.0,25.0};
        Assert.assertEquals("NNNNNNN", FPLOSCalculator.generateFPLOSPattern(ratevalue, lrvForSevenDays));
    }

    @Test
    public void given_rate_is_greater_than_0_and_lrv_is_0_then_fplos_pattern_should_be_YYYYYYY(){
        double ratevalue=50.0;
        double lrvForSevenDays[]={0.0,0.0,0.0,0.0,0.0,0.0,0.0};
        Assert.assertEquals("YYYYYYY",FPLOSCalculator.generateFPLOSPattern(ratevalue,lrvForSevenDays));
    }

    @Test
    public  void given_rate_is_50_and_lrv_is_greater_than_0_for_all_7_los_then_FPLOS__pattern_should_be_YYNNNNN()
    {
        double ratevalue=50.0;

        double lrvForSevenDays[]={40,55,65,75,80,30,25};
        Assert.assertEquals("YYNNNNN",FPLOSCalculator.generateFPLOSPattern(ratevalue,lrvForSevenDays));
    }

    @Test
    public  void given_rate_is_50_and_lrv_is_50_for_one_day_then_FPLOS__pattern_should_be_YYNNNNY()
    {
        double ratevalue=50.0;

        double lrvForSevenDays[]={50,45,65,35,60,40,35};
        Assert.assertEquals("YYNYNYY",FPLOSCalculator.generateFPLOSPattern(ratevalue,lrvForSevenDays));
    }


}
