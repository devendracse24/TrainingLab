package training.ideas.java.fibonacci;

/**
 * Created by idndde on 8/5/2014.
 */
public class FibonacciSeries {
    public static int[] fibonacciCalc(int number) {


        int series[] = new int[number];
        series[0]=0;
        series[1]=1;
        for(int counter=2; counter<number;counter++){
            series[counter]=series[counter-1]+series[counter-2];
            }
        return series;
    }
}
