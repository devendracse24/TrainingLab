package training.ideas.java.characters;

/**
 * Created by idndde on 8/18/2014.
 */
public class CharArrSubstrl {
    public static char[] getsubstr(char[] a, int startindex) {
        int Len=a.length-startindex;
        char output[]=new char[Len];
        for(int counter=startindex;counter<a.length;counter++){
            output[counter-startindex]=a[counter];
        }
        return output;
    }
}
