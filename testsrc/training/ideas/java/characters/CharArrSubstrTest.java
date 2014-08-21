package training.ideas.java.characters;

import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.characters.CharArrSubstrl;

/**
 * Created by idndde on 8/18/2014.
 */
public class CharArrSubstrTest {

    @Test
    public void find_substr_if_char_arr_is_abcabcd(){

        char [] A={'a','b','c','a','b','c','d'};
        int startindex=3;
        char [] expectedarr={'a','b','c','d'};
        Assert.assertArrayEquals(expectedarr, CharArrSubstrl.getsubstr(A, startindex));
    }


    @Test
    public void find_substr_if_char_arr_is_abca(){

        char [] A={'a','b','c','a'};
        int startindex=1;
        char [] expectedarr={'b','c','a'};
        Assert.assertArrayEquals(expectedarr,CharArrSubstrl.getsubstr(A,startindex));
    }
}
