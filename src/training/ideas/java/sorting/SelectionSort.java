
package training.ideas.java.sorting;


/**
* Created by idndde on 7/29/2014.
*/

public class SelectionSort {

    public enum selectionSortOrder{ ASCENDING,DESCENDING;}

    public static int [] selectionSortAsc(final int[] numbers)
    {
        return selectionSort(numbers,selectionSortOrder.ASCENDING);
    }

    public static int[] selectionSortDesc(final int [] numbers){
        return selectionSort(numbers,selectionSortOrder.DESCENDING);
    }

    private static int[] selectionSort(final int[] numbers,selectionSortOrder sortingOrder) {
        int lengthOfNumbers = numbers.length;
        int Counter=0 ;
        int temporary = 0;
        for (int counter = 0; counter < lengthOfNumbers-1; counter++) {
            Counter = counter;
            for (int k = Counter+1; k < lengthOfNumbers; k++)
            {
                if (orderCondition (numbers[Counter],numbers[k],sortingOrder)) {
                    Counter = k;
                }
            }
            temporary = numbers[counter];
            numbers[counter] = numbers[Counter];
            numbers[Counter] = temporary;
        }
        return numbers;
    }

    private static boolean orderCondition( int LHS, int RHS, selectionSortOrder sortOrder){
        if(sortOrder==selectionSortOrder.ASCENDING){
            return LHS>RHS;
        }
        else
            return RHS>LHS;
    }
}

