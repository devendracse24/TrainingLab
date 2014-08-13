package training.ideas.java.compressiondecompression;

/**
 * Created by idndde on 8/12/2014.
 */
public class CompressionD {
    public static String compress(String input) {
        String output="";
        char temp;
        for (int Counter = 0; Counter < input.length(); Counter++)
        {
            temp = input.charAt(Counter);
            int count = 1;

            if(input.indexOf(temp)<Counter)
                continue;
            for(int comparingElement=Counter+1;comparingElement<input.length();comparingElement++)
            {
                if (input.charAt(comparingElement) == temp)
                    count++;
            }
            if (count == 1)
                output = output + temp;
            else
                output = output + temp + String.valueOf(count);

        }
        return output;
    }
}

