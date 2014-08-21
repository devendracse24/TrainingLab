package training.ideas.java.characters;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idndde on 8/16/2014.
 */
public class CharacterLowerTest {

    @Test
    public void find_lower_if_character_are_AABB(){
        char [] chararray={'A','A','B','B'};
        char [] expectedlowerarr ={'a','a','b','b'};
        Assert.assertArrayEquals(expectedlowerarr, CharacterLower.getlower(chararray));
    }

    @Test
    public void find_lower_if_character_are_aabb11dd22(){
        char [] chararray={'A','A','B','B','1','1','D','D','2','2'};
        char [] expectedlowerarr = {'a','a','b','b','1','1','d','d','2','2'};
        Assert.assertArrayEquals(expectedlowerarr,CharacterLower.getlower(chararray));
    }

    @Test
    public void find_lower_if_character_are_aaSpecialSymbol_(){
        char [] chararray= {'a','A','@','%'};
        char [] expectedlowerarr = {'a','a','@','%'};
        Assert.assertArrayEquals(expectedlowerarr,CharacterLower.getlower(chararray));
    }
}
