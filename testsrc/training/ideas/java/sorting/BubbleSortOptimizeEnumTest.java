package training.ideas.java.sorting;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idndde on 7/29/2014.
 */
public class BubbleSortOptimizeEnumTest {

    @Test
    public void asc_2(){
        int inputNumbers[] = {2,1};
        int expectedNumbers[]={1,2};
        //boolean isDescending = true;
        Assert.assertArrayEquals(expectedNumbers, BubbleSortOptimizeEnum.asc(inputNumbers));
    }
    @Test
       public void asc_7(){
        int inputNumbers[] = {2,1,6,9,0,-4,7};
        int expectedNumbers[]={-4,0,1,2,6,7,9};
        // boolean isDescending = false;
       //
       // for (int i=0;i<=1000000;i++)
        Assert.assertArrayEquals(expectedNumbers, BubbleSortOptimizeEnum.asc(inputNumbers));

    }

    @Test
    public void asc_15(){
        int inputNumbers[] = {2,1,6,9,0,-4,7,11,3,15,12,9,17,14};
        int expectedNumbers[]={-4,0,1,2,3,6,7,9,9,11,12,14,15,17};
        // boolean isDescending = false;
        Assert.assertArrayEquals(expectedNumbers, BubbleSortOptimizeEnum.asc(inputNumbers));

    }


    @Test
    public void desc_2(){
        int inputNumbers[] = {2,1};
        int expectedNumbers[]={2,1};
        //boolean isDescending = true;
        Assert.assertArrayEquals(expectedNumbers, BubbleSortOptimizeEnum.desc(inputNumbers));
    }
    @Test
    public void desc_7(){
        int inputNumbers[] = {2,1,6,9,0,-4,7};
        int expectedNumbers[]={9,7,6,2,1,0,-4};
        // boolean isDescending = false;
        Assert.assertArrayEquals(expectedNumbers, BubbleSortOptimizeEnum.desc(inputNumbers));

    }

    @Test
    public void desc_15(){
        int inputNumbers[] = {2,1,6,9,0,-4,7,11,3,15,12,9,17,14};
        int expectedNumbers[]={17,15,14,12,11,9,9,7,6,3,2,1,0,-4};
        // boolean isDescending = false;
        Assert.assertArrayEquals(expectedNumbers, BubbleSortOptimizeEnum.desc(inputNumbers));

    }

}

