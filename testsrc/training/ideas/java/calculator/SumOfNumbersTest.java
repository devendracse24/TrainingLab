package training.ideas.java.calculator;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idndde on 7/28/2014.
 */
public class SumOfNumbersTest {
    @Test
    public void Sumall(){
        Assert.assertEquals(12 + 10.50 + 4.5, SumOfNumbers.sum());
    }
}
