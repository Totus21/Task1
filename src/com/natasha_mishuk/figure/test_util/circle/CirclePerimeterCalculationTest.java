package com.natasha_mishuk.figure.test_util.circle;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import com.natasha_mishuk.figure.circle.CircleParameter;
import com.natasha_mishuk.figure.circle.CirclePerimeterCalculation;

public class CirclePerimeterCalculationTest {
    private CircleParameter objectCircle;
    private CirclePerimeterCalculation objectCirclePerimeter;

    @Before
    public void initCircleParameterObject(){
        objectCircle=new CircleParameter();
    }

    @Before
    public void initCircleAreaObject(){
        objectCirclePerimeter =new CirclePerimeterCalculation();
    }

    @After
    public void clearCircleParameterObject(){
        objectCircle = null;
    }

    @After
    public void clearCircleAreaObject(){
        objectCirclePerimeter = null;
    }

    @Test
    public void calculateCirclePerimeterPositiveTest()
    {
        objectCircle.setCircleRadius(2.2);
        objectCirclePerimeter.calculateCirclePerimeter(objectCircle);
        double expected = 13.82;
        double actual = objectCircle.getCirclePerimeter();
        assertEquals("calculateCirclePerimeterTest fails. Expected is " + expected + " Actual is :" + actual, expected, actual,0.01 );

    }

    @Test
    public void calculateCirclePerimeterNegativeTest()
    {
        objectCircle.setCircleRadius(-2.2);
        objectCirclePerimeter.calculateCirclePerimeter(objectCircle);
        double expected =0;
        double actual = objectCircle.getCirclePerimeter();
        assertEquals("calculateCirclePerimeterTest fails. Expected is " + expected + " Actual is :" + actual, expected, actual,0.01 );

    }
}
