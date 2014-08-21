package training.ideas.java.characters;

import org.junit.Assert;
import org.junit.Test;

/**
* Created by idndde on 8/18/2014.
*/
public class CharArrStartEndIndexTest {

    @Test
    public void find_substr_if_char_arr_is_abcabcd_start_1_end_3() {

        char[] A = {'a', 'b', 'c', 'a', 'b', 'c', 'd'};
        int startindex = 1;
        int endindex = 3;
        char[] expectedarr = {'b', 'c', 'a'};
        Assert.assertArrayEquals(expectedarr, CharArrStartEndIndex.getsubstrindex(A, startindex, endindex));
    }

    @Test
    public void find_substr_if_char_arr_is_abca_start_1_end_0() {

        char[] A = {'a', 'b', 'c', 'a',};
        int startindex = 1;
        int endindex = 0;
        char[] expectedarr = {'b'};
        Assert.assertArrayEquals(expectedarr, CharArrStartEndIndex.getsubstrindex(A, startindex, endindex));
    }

}