package training.ideas.java.fibonacci;

/**
 * Created by idndde on 8/6/2014.
 */
public class FibonacciRecursion {
    public static int[] fibonacciSeries(int numbers) {
        int[] fibonacciSeriesArr = new int[numbers];
        for (int counter = 0; counter <numbers; counter++) {
            fibonacciSeriesArr[counter] = fibonacciRecursive(counter);
        }
        return fibonacciSeriesArr;
    }

    public static int fibonacciRecursive(int index) {
        if (index == 0)
            return 0;
        else
            if (index == 1)
            return 1;
        else
            return (fibonacciRecursive(index - 1) + fibonacciRecursive(index - 2));


    }
}