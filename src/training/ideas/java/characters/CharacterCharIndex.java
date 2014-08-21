package training.ideas.java.characters;

/**
 * Created by idndde on 8/16/2014.
 */
public class CharacterCharIndex {
    public static int indexForChar(char[] chararray, char a) {

        for(int counter=0;counter<chararray.length;counter++){
            if(chararray[counter]==a){
                return counter;
            }
        }

        return -1;
    }
}
