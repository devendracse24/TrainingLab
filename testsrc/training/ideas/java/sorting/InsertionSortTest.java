package training.ideas.java.sorting;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idndde on 8/4/2014.
 */

public class InsertionSortTest {

    @Test
    public void orderNumbersPositive_InsertionSort(){
        int [] Numbers={111,58,30,40,125};
        int[] SortNum={30,40,58,111,125};
        Assert.assertArrayEquals("Sorting does not match ", SortNum, InsertionSort.insertionSortAsc(Numbers));
    }


    @Test
    public void orderNumbersPositiveNegative_InsertionSort(){
        int [] Numbers={106,-10,30,40,145};
        int[] SortNum={-10,30,40,106,145};
        Assert.assertArrayEquals("Sorting does not match", SortNum, InsertionSort.insertionSortAsc(Numbers));
    }

    @Test
    public void Desc_InsertionSort_for_Postive_Numbers(){
        int [] Numbers={21,11,31,41};
        int[] SortNum={41,31,21,11};
        Assert.assertArrayEquals("Sorting does not match", SortNum, InsertionSort.insertionSortDesc(Numbers));
    }

    @Test
    public void Desc_InsertionSort_some_negative_numbers(){
        int [] Numbers={-22,0,-5,7};
        int[] SortNum={7,0,-5,-22};
        Assert.assertArrayEquals("Sorting does not match", SortNum, InsertionSort.insertionSortDesc(Numbers));
    }

    @Test
    public void Desc_InsertionSort_all_negative_numbers(){
        int [] Numbers={-22,-66,-35,-47};
        int[] SortNum={-22,-35,-47,-66};
        Assert.assertArrayEquals("Sorting does not match", SortNum, InsertionSort.insertionSortDesc(Numbers));
    }



}

