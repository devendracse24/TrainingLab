package training.ideas.java.clock_angle;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idndde on 8/10/2014.
 */
public class ClockAngleTest {

    @Test
    public void convert_clock_time_to_angle_when_time_is_12_00(){

        int hourtime=12;
        int mintime=0;
        double expectedangle =0;
        Assert.assertEquals(expectedangle,ClockAngle.ClockToAngle(hourtime,mintime),0);
    }

    @Test
    public void convert_clock_time_to_angle_when_time_is_06_00(){

        int hourtime=6;
        int mintime=0;
        double expectedangle =180;
        Assert.assertEquals(expectedangle,ClockAngle.ClockToAngle(hourtime,mintime),0);
    }

    @Test
    public void convert_clock_time_to_angle_when_time_is_12_05(){

        int hourtime=12;
        int mintime=5;
        double expectedangle =27.5;
        Assert.assertEquals(expectedangle,ClockAngle.ClockToAngle(hourtime,mintime),0);
    }

    @Test
    public void convert_clock_time_to_angle_when_time_is_12_15(){

        int hourtime=12;
        int mintime=15;
        double expectedangle =82.5;
        Assert.assertEquals(expectedangle,ClockAngle.ClockToAngle(hourtime,mintime),0);
    }

    @Test
    public void convert_clock_time_to_angle_when_time_is_12_25(){

        int hourtime=12;
        int mintime=25;
        double expectedangle =137.5;
        Assert.assertEquals(expectedangle,ClockAngle.ClockToAngle(hourtime,mintime),0);
    }

    @Test
         public void convert_clock_time_to_angle_when_time_is_12_35(){

        int hourtime=12;
        int mintime=35;
        double expectedangle =192.5;
        Assert.assertEquals(expectedangle,ClockAngle.ClockToAngle(hourtime,mintime),0);
    }

    @Test
    public void convert_clock_time_to_angle_when_time_is_12_45(){

        int hourtime=12;
        int mintime=45;
        double expectedangle =247.5;
        Assert.assertEquals(expectedangle,ClockAngle.ClockToAngle(hourtime,mintime),0);
    }

    @Test
    public void convert_clock_time_to_angle_when_time_is_12_55(){

        int hourtime=12;
        int mintime=55;
        double expectedangle =302.5;
        Assert.assertEquals(expectedangle,ClockAngle.ClockToAngle(hourtime,mintime),0);
    }

    @Test
    public void convert_clock_time_to_angle_when_time_is_11_55(){

        int hourtime=11;
        int mintime=55;
        double expectedangle =332.5;
        Assert.assertEquals(expectedangle,ClockAngle.ClockToAngle(hourtime,mintime),0);
    }

    @Test
    public void convert_clock_time_to_angle_when_time_is_10_35(){

        int hourtime=10;
        int mintime=35;
        double expectedangle =252.5;
        Assert.assertEquals(expectedangle,ClockAngle.ClockToAngle(hourtime,mintime),0);
    }

    @Test
    public void convert_clock_time_to_angle_when_time_is_9_25(){

        int hourtime=9;
        int mintime=25;
        double expectedangle =227.5;
        Assert.assertEquals(expectedangle,ClockAngle.ClockToAngle(hourtime,mintime),0);
    }

    @Test
    public void convert_clock_time_to_angle_when_time_is_8_25(){

        int hourtime=8;
        int mintime=15;
        double expectedangle =202.5;
        Assert.assertEquals(expectedangle,ClockAngle.ClockToAngle(hourtime,mintime),0);
    }

    @Test
    public void convert_clock_time_to_angle_when_time_is_7_21(){

        int hourtime=7;
        int mintime=21;
        double expectedangle =265.5;
        Assert.assertEquals(expectedangle,ClockAngle.ClockToAngle(hourtime,mintime),0);
    }

    @Test
    public void convert_clock_time_to_angle_when_time_is_5_49(){

        int hourtime=5;
        int mintime=49;
        double expectedangle =240.5;
        Assert.assertEquals(expectedangle,ClockAngle.ClockToAngle(hourtime,mintime),0);
    }


}
