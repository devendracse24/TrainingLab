package training.ideas.java.characters;

/**
 * Created by idndde on 8/16/2014.
 */
public class CharacterCharOccur {
    public static int getOccurance(char[] chararray, int index) {

        for(int counter=index+1;counter<chararray.length;counter++){
            if(chararray[counter]==chararray[index]){
                return counter;
            }
        }

        return -1;
    }

}
