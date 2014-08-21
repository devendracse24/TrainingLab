package training.ideas.java.characters;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idndde on 8/18/2014.
 */
public class CharArrFindOccTest {

    @Test
         public void find_occurance_of_Char_a_if_arr_abcabcd() {
        char[] A = {'a', 'b', 'c', 'a', 'b', 'c', 'd'};
        char B='a';
        int expectedoccurance=2;
        Assert.assertEquals(expectedoccurance,CharArrFindOcc.getoccurance(A,B));

    }

    @Test
    public void find_occurance_of_Char_z_if_arr_abcabcd() {
        char[] A = {'a', 'b', 'c', 'a', 'b', 'c', 'd'};
        char B='z';
        int expectedoccurance=0;
        Assert.assertEquals(expectedoccurance,CharArrFindOcc.getoccurance(A,B));

    }
}
