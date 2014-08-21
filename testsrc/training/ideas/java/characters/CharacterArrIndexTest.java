package training.ideas.java.characters;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idndde on 8/16/2014.
 */
public class CharacterArrIndexTest {

    @Test
    public void find_characterarray_if_index_is_1_and_array_abcabcd(){
        char[] chararray={'a','b','c','a','b','c','d'};
        int index=3;
        char []  expectedarray={'a','b','c','d'};
        Assert.assertArrayEquals(expectedarray, CharacterArrIndex.getchar(chararray, index));
    }
}
