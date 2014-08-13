package training.ideas.java.decisions;

/**
 * Created by idndde on 7/25/2014.
 */
public class MINLOScalc {

    public static int MINLOSValue(String[] fplos) {
        int minlos = 0;
        for (; minlos < 7; minlos++) {
            if (fplos[minlos] == "Y"){
                minlos =minlos+1;
                break;
            }

        }
        return minlos;
    }

}