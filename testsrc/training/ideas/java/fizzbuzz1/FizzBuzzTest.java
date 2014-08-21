package training.ideas.java.fizzbuzz1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idndde on 8/10/2014.
 */
public class FizzBuzzTest {

    @Test
    public void fizzBuzz_when_number_enter_1(){
        int input=1;
        String expected="1";
        Assert.assertEquals(expected,FizzBuzz.fizzBuzzCalc(input));
    }

    @Test
    public void fizzBuzz_when_number_enter_3(){
        int input=3;
        String expected="Fizz";
        Assert.assertEquals(expected,FizzBuzz.fizzBuzzCalc(input));
    }

    @Test
    public void fizzBuzz_when_number_enter_5(){
        int input=5;
        String expected="Buzz";
        Assert.assertEquals(expected,FizzBuzz.fizzBuzzCalc(input));
    }

    @Test
    public void fizzBuzz_when_number_enter_15(){
        int input=15;
        String expected="FizzBuzz";
        Assert.assertEquals(expected,FizzBuzz.fizzBuzzCalc(input));
    }

    @Test
    public void fizzBuzz_when_number_enter_30(){
        int input=30;
        String expected="FizzBuzz";
        Assert.assertEquals(expected,FizzBuzz.fizzBuzzCalc(input));
    }

    @Test
    public void fizzBuzz_when_number_enter_11(){
        int input=11;
        String expected="11";
        Assert.assertEquals(expected,FizzBuzz.fizzBuzzCalc(input));
    }
}
