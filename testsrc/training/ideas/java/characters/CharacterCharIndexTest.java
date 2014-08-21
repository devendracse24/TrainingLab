package training.ideas.java.characters;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idndde on 8/16/2014.
 */
public class CharacterCharIndexTest {

    @Test
    public void findindex_if_char_z_with_array_bbab(){
        char[]chararray={'b','b','a','b'};
        char A='z';
        int expectedindex=-1;
        Assert.assertEquals(expectedindex,CharacterCharIndex.indexForChar(chararray,A));
    }

    @Test
    public void findindex_if_char_a_with_array_bbab(){
        char[]chararray={'b','b','a','b'};
        char A='a';
        int expectedindex=2;
        Assert.assertEquals(expectedindex,CharacterCharIndex.indexForChar(chararray,A));
    }

    @Test
    public void findindex_if_char_b_with_array_bbab(){
        char[]chararray={'b','b','a','b'};
        char A='b';
        int expectedindex=0;
        Assert.assertEquals(expectedindex,CharacterCharIndex.indexForChar(chararray,A));
    }

    @Test
    public void findindex_if_char_b_with_array_Bbab(){
        char[]chararray={'B','b','a','b'};
        char A='b';
        int expectedindex=1;
        Assert.assertEquals(expectedindex,CharacterCharIndex.indexForChar(chararray,A));
    }



}
