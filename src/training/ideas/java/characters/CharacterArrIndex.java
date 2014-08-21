package training.ideas.java.characters;

/**
 * Created by idndde on 8/16/2014.
 */
public class CharacterArrIndex {
    public static char[] getchar(char[] chararray, int index) {
        char []output=new char[chararray.length-index];
        for(int counter=index;counter<chararray.length-index;counter++) {
            output[counter]=chararray[counter];
        }
        return output;

    }
}
