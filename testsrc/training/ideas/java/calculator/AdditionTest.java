package training.ideas.java.calculator;

 import junit.framework.Assert;
 import org.junit.Test;

 import static training.ideas.java.calculator.Addition.addIntArraywhile;

/*
 * Created by idndde on 7/21/2014.
  * */
public class AdditionTest {
    private static int counter=0;
   @Test
   public void addTwoIntegers(){
       Addition number = new Addition(2,4);
        Assert.assertEquals(2+4, number.add());
    }

    @Test
    public void minus3_plus4_gives1(){
        Addition number = new Addition(-3,4);
        Assert.assertEquals(1, number.add());
    }

    @Test
    public void minus_3_minus_4_gives_minu_7(){
        Addition number = new Addition(-3,-4);
        Assert.assertEquals(-7, number.add());
    }
    @Test
    public void addTwoDouble(){
        Addition number;
        number = new Addition(2.5,5.5);
        Assert.assertEquals(2.5+5.5, number.add1());
    }

    @Test
    public void addTwoDouble_negative(){
        Addition number;
        number = new Addition(-2.5,-5.5);
        Assert.assertEquals(-8.0, number.add1());
    }

    @Test
    public void addTwoDouble_positive(){

        Assert.assertEquals(8+5,Addition.addTwoPositive(8,5) );
    }
    @Test
    public void arrayaddint(){
        int arr[]= {3,6};
        Assert.assertEquals(3+6,Addition.addIntArray(arr));
    }


    @Test
    public void arrayAddIntWhile(){
        int arr[]= {3,6};
        Assert.assertEquals(3+6, Addition.addIntArraywhile(arr));
    }
/*
   @Test
    public void arrayadddouble(){
       double arr[]={4.0,5.5};
       Assert.assertEquals(4.0+5.5,Addition.addDoubleArray(arr));
   }
*/

  /*  @Test
    public void CompareFPLOSoutput(){
        Assert.assertEquals("YYYYNYNN", FPLOSOutput.fploscalc());
    }
*/



/*    @Test
    public void Loop(){
        Assert.assertEquals("Sum is greater than 15", Addition.);
    }*/

}
