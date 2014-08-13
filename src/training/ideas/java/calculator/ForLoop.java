package training.ideas.java.calculator;

/**
 * Created by idndde on 7/24/2014.
 */
public class ForLoop {
    public static String starGraph(){
        String graph="";
        for(int a=0;a<=5;a++){
            graph+="*";
            System.out.print('*');
        }
        return graph ;
    }
}
