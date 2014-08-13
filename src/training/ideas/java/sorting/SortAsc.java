package training.ideas.java.sorting;

/**
 * Created by idndde on 7/28/2014.
 */
public class SortAsc {
    public static int[] sortAscend(int numbers[]) {
        int temp=0;
        for(int i=0; i<numbers.length;i++)
        {
            for(int j=i+1;j<numbers.length;j++)
            {
                if (numbers[i]>numbers[j])
                {
                    temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }

        }

        return numbers;
    }

}
