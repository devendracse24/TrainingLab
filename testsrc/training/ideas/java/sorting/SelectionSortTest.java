package training.ideas.java.sorting;
import org.junit.Assert;
import org.junit.Test;

/**
* Created by idndde on 7/29/2014.
*/
public class SelectionSortTest {

    @Test
    public void asc_6(){
        int inputNumbers[] = {7,1,6,3,8,4};
        int expectedNumbers[]={1,3,4,6,7,8};
        Assert.assertArrayEquals(expectedNumbers, SelectionSort.selectionSortAsc(inputNumbers));
    }
    @Test
    public void asc_7(){
        int inputNumbers[] = {2,1,6,9,0,-4,7};
        int expectedNumbers[]={-4,0,1,2,6,7,9};
        Assert.assertArrayEquals(expectedNumbers, SelectionSort.selectionSortAsc(inputNumbers));

    }

    @Test
    public void asc_15(){
        int inputNumbers[] = {2,1,6,9,0,-4,7,11,3,15,12,9,17,14};
        int expectedNumbers[]={-4,0,1,2,3,6,7,9,9,11,12,14,15,17};
        Assert.assertArrayEquals(expectedNumbers, SelectionSort.selectionSortAsc(inputNumbers));

    }


    @Test
    public void desc_2(){
        int inputNumbers[] = {2,1};
        int expectedNumbers[]={2,1};
        Assert.assertArrayEquals(expectedNumbers, SelectionSort.selectionSortDesc(inputNumbers));
    }
    @Test
    public void desc_7(){
        int inputNumbers[] = {2,1,6,9,0,-4,7};
        int expectedNumbers[]={9,7,6,2,1,0,-4};
        Assert.assertArrayEquals(expectedNumbers, SelectionSort.selectionSortDesc(inputNumbers));

    }

    @Test
    public void desc_15(){
        int inputNumbers[] = {2,1,6,9,0,-4,7,11,3,15,12,9,17,14};
        int expectedNumbers[]={17,15,14,12,11,9,9,7,6,3,2,1,0,-4};
        Assert.assertArrayEquals(expectedNumbers, SelectionSort.selectionSortDesc(inputNumbers));
    }

}
