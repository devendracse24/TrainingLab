package training.ideas.java.characters;

import org.junit.Assert;
import org.junit.Test;

/**
* Created by idndde on 8/14/2014.
*/
public class CharacterConcateTest {

    @Test
    public void concatinate_when_A_B() {
        char[] one = {'A'};
        char[] two = {'B'};
        char[] expected = {'A', 'B'};
        Assert.assertArrayEquals(expected, CharacterConcate.concatinatechar(one, two));
    }

    @Test
         public void concatinate_when_ABC_DEF(){
        char []one={'A','B','C'};
        char []two={'D','E','F'};
        char []expected ={'A','B','C','D','E','F'};
        Assert.assertArrayEquals(expected,CharacterConcate.concatinatechar(one,two));
    }

    @Test
    public void concatinate_when_blank_A(){
        char []one={};
        char []two={'A'};
        char []expected ={'A'};
        Assert.assertArrayEquals(expected,CharacterConcate.concatinatechar(one,two));
    }

    @Test
    public void concatinate_when_blank_blank(){
        char []one={};
        char []two={};
        char []expected ={};
        Assert.assertArrayEquals(expected,CharacterConcate.concatinatechar(one,two));
    }

    @Test
    public void concatinate_when_aBC_DEz(){
        char []one={'a','B','c'};
        char []two={'D','E','z'};
        char []expected ={'a','B','c','D','E','z'};
        Assert.assertArrayEquals(expected,CharacterConcate.concatinatechar(one,two));
    }
}
