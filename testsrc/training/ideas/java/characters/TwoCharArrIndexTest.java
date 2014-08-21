package training.ideas.java.characters;

import org.junit.Assert;
import org.junit.Test;

/**
* Created by idndde on 8/16/2014.
*/
public class TwoCharArrIndexTest {

    @Test
    public void findindex_if_char_ef_with_array_abcabcd(){
        char[]chararray1={'a','b','c','a','b','c','d'};
        char [] chararray2={'e','f'};
        int expectedindex=-1;
        Assert.assertEquals(expectedindex, TwoCharArrIndex.indexForTwoCharArr(chararray1, chararray2));
    }

    @Test
    public void findindex_if_char_a_with_array_abcabcd(){
        char[]chararray1={'a','b','c','a','b','c','d'};
        char [] chararray2={'a','b'};
        int expectedindex=0;
        Assert.assertEquals(expectedindex, TwoCharArrIndex.indexForTwoCharArr(chararray1, chararray2));
    }
}
