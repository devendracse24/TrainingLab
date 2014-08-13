package training.ideas.java.sorting;

import org.junit.Test;

/**
 * Created by idndde on 7/28/2014.
 */
public class SortDescTest {
 @Test
    public void given_random_numbers_to_sort_in_descending_numbers()
    {
        int numbers[]={9,3,12,1,8};
        int sortindescendingorder[]={12,9,8,3,1};
        org.junit.Assert.assertArrayEquals(sortindescendingorder, SortDesc.sortDescend(numbers));

    }

}
