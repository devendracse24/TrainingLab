package training.ideas.java.characters;

/**
 * Created by idndde on 8/16/2014.
 */
public class CharacterUpper {
    public static char[] getupper(char[] chararray) {

        for(int counter=0;counter<chararray.length;counter++) {
            chararray[counter]=Character.toUpperCase(chararray[counter]);
        }
        return chararray;
    }
}
