

package training.ideas.java.fibonacci;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idndde on 8/5/2014.
 */

public class FibonacciSeriesTest {

    @Test
    public void fibonacci_series_for_5_number(){
        int number =5;
        int expectedNumber[]={0,1,1,2,3};
        Assert.assertArrayEquals(expectedNumber, FibonacciSeries.fibonacciCalc(number));
    }

    @Test
    public void fibonacci_series_for_10_number(){
        int number =10;
        int expectedNumber[]={0,1,1,2,3,5,8,13,21,34};
        Assert.assertArrayEquals(expectedNumber, FibonacciSeries.fibonacciCalc(number));
    }

    @Test
    public void fibonacci_series_for_15_number(){
        int number =15;
        int expectedNumber[]={0,1,1,2,3,5,8,13,21,34,55,89,144,233,377};
        Assert.assertArrayEquals(expectedNumber, FibonacciSeries.fibonacciCalc(number));
    }
}


