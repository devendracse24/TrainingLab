package training.ideas.java.characters;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idndde on 8/16/2014.
 */
public class CharacterCharOccurTest {

    @Test
    public void find_index_of_character_if_index_is_1(){
        char[] chararray={'a','b','c','a','b','c'};
        int index=1;
        int expectedindex=4;
        Assert.assertEquals(expectedindex,CharacterCharOccur.getOccurance(chararray,index));
    }

    @Test
    public void find_index_of_character_if_index_is_0(){
        char[] chararray={'a','b','c','a','b','c'};
        int index=0;
        int expectedindex=3;
        Assert.assertEquals(expectedindex,CharacterCharOccur.getOccurance(chararray,index));
    }

    @Test
         public void find_index_of_character_if_index_is_2(){
        char[] chararray={'a','b','c','a','b','c'};
        int index=2;
        int expectedindex=5;
        Assert.assertEquals(expectedindex,CharacterCharOccur.getOccurance(chararray,index));
    }

    @Test
    public void find_index_of_character_if_index_is_3(){
        char[] chararray={'a','b','c','a','b','c'};
        int index=3;
        int expectedindex=-1;
        Assert.assertEquals(expectedindex,CharacterCharOccur.getOccurance(chararray,index));
    }
}
