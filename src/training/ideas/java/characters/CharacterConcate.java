package training.ideas.java.characters;

/**
 * Created by idndde on 8/14/2014.
 */
public class CharacterConcate {
    public static char[] concatinatechar(char[] one, char[] two) {

        int oneLen=one.length;
        int twoLen=two.length;
        char[] output = new char[oneLen+twoLen];
        System.arraycopy(one,0,output,0,oneLen);
        System.arraycopy(two,0,output,oneLen,twoLen);
        return output;
    }
}