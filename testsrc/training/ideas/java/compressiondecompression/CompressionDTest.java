package training.ideas.java.compressiondecompression;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idndde on 8/12/2014.
 */
public class CompressionDTest {

    @Test
         public  void compression_string_when_input_AA()
    {
        String input="AA";
        String output="A2";
        Assert.assertEquals(output, CompressionD.compress(input));
    }

    @Test
    public  void compression_string_when_input_AABBBB()
    {
        String input="AABBB";
        String output="A2B3";
        Assert.assertEquals(output, CompressionD.compress(input));
    }

    @Test
    public  void compression_string_when_input_ABC()
    {
        String input="ABC";
        String output="ABC";
        Assert.assertEquals(output, CompressionD.compress(input));
    }

    @Test
    public  void compression_string_when_input_AABBBBCCCC()
    {
        String input="AABBBCCCC";
        String output="A2B3C4";
        Assert.assertEquals(output, CompressionD.compress(input));
    }
}


