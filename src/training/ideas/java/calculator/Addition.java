
package training.ideas.java.calculator;


/*
 * Created by idndde on 7/21/2014.
 */

public class Addition {

    private static double[] arr;
    private final double first;
    private final double second;
    private static int counter=0;


    public Addition(int first, int second) {

        this.first = first;
      this.second = second;
    }
    public int add() {
        return (int) (first+second);
    }
    public Addition(double first, double second) {
        this.first = first;
        this.second = second;
    }

    public double add1() {
        return first+second;
    }


    public static int addTwoPositive(int a, int b) {
        return a+b;
    }

    public static int addIntArray(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        return total;
    }

    public static int addIntArraywhile(int[] arr) {
        int total=0;
        int i=0;
        while(i<arr.length ){
            total=total + arr[i];
            i= ++i;
        }
        return total;
    }


/*    public static double addDoubleArray(double[] arr) {
        Addition.arr = arr;
        double total=0.0;
        for(double i=0; i<arr.length; i++){
            total = total +arr[((double)i)];
        }
        return total;
    }*/
}

