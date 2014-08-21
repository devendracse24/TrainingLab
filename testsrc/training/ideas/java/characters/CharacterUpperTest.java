package training.ideas.java.characters;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idndde on 8/16/2014.
 */
public class CharacterUpperTest {

    @Test
    public void find_upper_if_character_are_aabb(){
        char [] chararray={'a','a','b','b'};
        char [] expectedupperarr ={'A','A','B','B'};
        Assert.assertArrayEquals(expectedupperarr,CharacterUpper.getupper(chararray));
    }

    @Test
    public void find_upper_if_character_are_aabb11dd22(){
        char [] chararray={'a','a','b','b','1','1','d','d','2','2'};
        char [] expectedupperarr ={'A','A','B','B','1','1','D','D','2','2'};
        Assert.assertArrayEquals(expectedupperarr,CharacterUpper.getupper(chararray));
    }

    @Test
    public void find_upper_if_character_are_aaSpecialSymbol_(){
        char [] chararray={'a','a','@','%'};
        char [] expectedupperarr ={'a','A','@','%'};
        Assert.assertArrayEquals(expectedupperarr,CharacterUpper.getupper(chararray));
    }
}
