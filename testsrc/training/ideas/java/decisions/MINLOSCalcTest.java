package training.ideas.java.decisions;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idndde on 7/25/2014.
 */
public class MINLOSCalcTest {
    @Test
    public void given_FPLOS_is_YYYYYYY_then_MINLOS_should_be_1(){

        String fplos[]={"Y","Y","Y","Y","Y","Y","Y"};
        Assert.assertEquals(1,MINLOScalc.MINLOSValue(fplos));

    }

    @Test
       public void given_FPLOS_is_NYYYYYY_then_MINLOS_should_be_2(){

        String fplos[]={"N","Y","Y","Y","Y","Y","Y"};
        Assert.assertEquals(2,MINLOScalc.MINLOSValue(fplos));
    }

    @Test
    public void given_FPLOS_is_NNYYYYY_then_MINLOS_should_be_3(){

        String fplos[]={"N","N","Y","Y","Y","Y","Y"};
        Assert.assertEquals(3,MINLOScalc.MINLOSValue(fplos));
    }
    @Test
         public void given_FPLOS_is_NNYYYYY_then_MINLOS_should_be_4(){

        String fplos[]={"N","N","N","Y","Y","Y","Y"};
        Assert.assertEquals(4,MINLOScalc.MINLOSValue(fplos));
    }
    @Test
    public void given_FPLOS_is_NNYYYYY_then_MINLOS_should_be_5(){

        String fplos[]={"N","N","N","N","Y","Y","Y"};
        Assert.assertEquals(5,MINLOScalc.MINLOSValue(fplos));
    }
    @Test
    public void given_FPLOS_is_NNYYYYY_then_MINLOS_should_be_6(){

        String fplos[]={"N","N","N","N","N","Y","Y"};
        Assert.assertEquals(6,MINLOScalc.MINLOSValue(fplos));
    }
    @Test
    public void given_FPLOS_is_NNYYYYY_then_MINLOS_should_be_7(){

        String fplos[]={"N","N","N","N","N","N","Y"};
        Assert.assertEquals(7,MINLOScalc.MINLOSValue(fplos));
    }

    @Test
    public void minlos()
    {

    }

}
