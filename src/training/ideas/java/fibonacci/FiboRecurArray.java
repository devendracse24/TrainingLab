package training.ideas.java.fibonacci;

/**
* Created by idndde on 8/7/2014.
*/
public class FiboRecurArray {

    public static int[] fiboArr(int number)
    {
            int[] fibonacciSeriesArray = new int[number];
            fibonacciSeries(fibonacciSeriesArray,number);
            return fibonacciSeriesArray;

        }
    public static void fibonacciSeries(int[] fibonacciSeriesArray, int num) {
        if (num == 0)
        {
            return;
        }
        if (num == 1)
        {
            fibonacciSeriesArray[0] = 0;
            return;
        }
        if (num == 2)
        {
            fibonacciSeriesArray[1] = 1;
            return ;
        }
        fibonacciSeries(fibonacciSeriesArray, num - 1);

        fibonacciSeriesArray[num - 1] = fibonacciSeriesArray[num - 2] + fibonacciSeriesArray[num - 3];

    }
}
