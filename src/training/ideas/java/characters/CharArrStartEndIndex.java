package training.ideas.java.characters;

/**
 * Created by idndde on 8/18/2014.
 */
public class CharArrStartEndIndex {
    public static char[] getsubstrindex(char[] a, int startindex, int endindex) {

        int Len=a.length-startindex-endindex;
        char output[]=new char[Len];
        for(int counter=startindex;counter<Len+1;counter++){
            output[counter-startindex]=a[counter];
        }
        return output;

    }
}
