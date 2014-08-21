package training.ideas.java.fibonacci;

import org.junit.Assert;
import org.junit.Test;

/**
* Created by idndde on 8/7/2014.
*/
public class FiboRecurArrayTest {

    @Test
    public  void given_recursion_series_of_5_numbers()
        {
        int number=5;
        int expectedNumber[]={0,1,1,2,3};
        Assert.assertArrayEquals(expectedNumber, FiboRecurArray.fiboArr(number));
        }

    @Test
    public  void given_recursion_series_of_8_numbers()
    {
        int number=8;
        int expectedNumber[]={0,1,1,2,3,5,8,13};
        Assert.assertArrayEquals(expectedNumber, FiboRecurArray.fiboArr(number));
    }

    @Test
    public  void given_recursion_series_of_0_numbers()
    {
        int number=0;
        int expectedNumber[]={};
        Assert.assertArrayEquals(expectedNumber, FiboRecurArray.fiboArr(number));
    }

    @Test
    public  void given_recursion_series_of_1_numbers()
    {
        int number=1;
        int expectedNumber[]={0};
        Assert.assertArrayEquals(expectedNumber, FiboRecurArray.fiboArr(number));
    }



}
