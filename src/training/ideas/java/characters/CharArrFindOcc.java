package training.ideas.java.characters;

/**
 * Created by idndde on 8/18/2014.
 */
public class CharArrFindOcc {
    public static int getoccurance(char[] a, char b) {

        int counter=0;
        for(int element=0;element<a.length;element++){
            if(a[element]==b)
            counter=counter+1;
        }
       return counter;

    }
}
