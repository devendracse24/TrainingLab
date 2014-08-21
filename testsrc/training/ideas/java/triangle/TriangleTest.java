package training.ideas.java.triangle;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idndde on 8/13/2014.
 */
public class TriangleTest {

    //public static enum TriangleType{NOTRIANGLE,EQUILATERAL,ISOSCELES,RIGHTANGLE,TRINGLE};

    @Test
     public void test_if_right_triangle(){

//        String a= "This is not a triangle";
//        String b ="This is a Equilateral triangle";
//        String c= "This is a Isosceles triangle";
//        String d="This is a Right Angle triangle";
//        String e= "This is a triangle only";
        double angle1=30;
        double angle2=60;
        double angle3=90;
        Assert.assertEquals( Triangle.TriangleType.RIGHTANGLE,Triangle.trianglecalc(angle1,angle2,angle3));
    }

    @Test
         public void test_if_Equilateral_triangle(){

        double angle1=60;
        double angle2=60;
        double angle3=60;
        Assert.assertEquals("This is a Equilateral triangle", Triangle.TriangleType.EQUILATERAL,Triangle.trianglecalc(angle1,angle2,angle3));
    }

    @Test
         public void test_if_Isosceles_triangle(){

        double angle1=50;
        double angle2=50;
        double angle3=80;
        Assert.assertEquals("This is a Equilateral triangle", Triangle.TriangleType.ISOSCELES,Triangle.trianglecalc(angle1,angle2,angle3));
    }

    @Test
         public void test_if_triangle_only(){

        double angle1=50;
        double angle2=10;
        double angle3=120;
        Assert.assertEquals("This is a triangle only", Triangle.TriangleType.TRINGLE,Triangle.trianglecalc(angle1,angle2,angle3));
    }

    @Test
    public void test_if_Notriangle_only(){

        double angle1=50;
        double angle2=10;
        double angle3=150;
        Assert.assertEquals("This is not a triangle", Triangle.TriangleType.NOTRIANGLE,Triangle.trianglecalc(angle1,angle2,angle3));

    }

    @Test
    public void test_if_Notriangle_with_0(){

        double angle1=30;
        double angle2=0;
        double angle3=150;
        Assert.assertEquals("This is not a triangle", Triangle.TriangleType.NOTRIANGLE,Triangle.trianglecalc(angle1,angle2,angle3));

    }

}
