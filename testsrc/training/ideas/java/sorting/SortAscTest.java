package training.ideas.java.sorting;

import org.junit.Test;

/**
 * Created by idndde on 7/28/2014.
 */
public class SortAscTest {
@Test
    public void given_random_integers_to_sort_in_ascending_order() {

        int numbers[] = {9, 3, 12, 1, 8};
        int sortinascendingorder[] = {1, 3, 8, 9, 12};
        org.junit.Assert.assertArrayEquals(sortinascendingorder, SortAsc.sortAscend(numbers));

    }
}