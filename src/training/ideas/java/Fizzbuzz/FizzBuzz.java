package training.ideas.java.Fizzbuzz;

/**
 * Created by idndde on 8/10/2014.
 */
public class FizzBuzz {
    public static String fizzBuzzCalc(int input) {
        String output = "";
        if (input % 3 == 0 && input % 5 == 0) {
            output = output + "FizzBuzz";  /* if number divisible by both 3 & 5 */
        }
        else if (input % 3 == 0)
         {
                output = output + "Fizz"; /* if number divisible by  3 only */
         }
         else if (input % 5 == 0)
         {
                output = output + "Buzz"; /* if number divisible by  5 only */
         }
         else
        {
           output = "" + input; /* if number is not divisible by 3 & 5 */
         }
            return output;
        }

    }

