package training.ideas.java.fibonacci;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idndde on 8/6/2014.
 */
public class FibonacciRecursionTest {

    @Test
    public void Fibonacci_number_3_using_recursive(){
        int numbers=3;
        int expectedNumber[]={0,1,1};
        Assert.assertArrayEquals(expectedNumber,FibonacciRecursion.fibonacciSeries(numbers));
    }

    @Test
    public void Fibonacci_number_4_using_recursive(){
        int numbers=4;
        int expectedNumber[]={0,1,1,2};
        Assert.assertArrayEquals(expectedNumber, FibonacciRecursion.fibonacciSeries(numbers));
    }

    @Test
        public void Fibonacci_number_5_using_recursive(){
        int numbers=5;
        int expectedNumber[]={0,1,1,2,3};
        Assert.assertArrayEquals(expectedNumber, FibonacciRecursion.fibonacciSeries(numbers));
    }

    @Test
    public void Fibonacci_number_6_using_recursive(){
        int numbers=6;
        int expectedNumber[]={0,1,1,2,3,5};
        Assert.assertArrayEquals(expectedNumber, FibonacciRecursion.fibonacciSeries(numbers));
    }
}

