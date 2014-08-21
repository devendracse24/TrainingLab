package training.ideas.java.characters;

/**
 * Created by idndde on 8/16/2014.
 */
public class CharacterLower {
    public static char[] getlower(char[] chararray) {

        for(int counter=0;counter<chararray.length;counter++) {
            chararray[counter]=Character.toLowerCase(chararray[counter]);
        }
        return chararray;
    }
}
