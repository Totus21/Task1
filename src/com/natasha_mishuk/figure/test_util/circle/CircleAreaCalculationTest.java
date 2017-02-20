package com.natasha_mishuk.figure.test_util.circle;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import com.natasha_mishuk.figure.circle.CircleParameter;
import com.natasha_mishuk.figure.circle.CircleAreaCalculation;

public class CircleAreaCalculationTest {
    private CircleParameter objectCircle;
    private CircleAreaCalculation objectCircleArea;

    @Before
    public void initCircleParameterObject(){
        objectCircle=new CircleParameter();
    }

    @Before
    public void initCircleAreaObject(){
        objectCircleArea =new CircleAreaCalculation();
    }

    @After
    public void clearCircleParameterObject(){
        objectCircle = null;
    }

    @After
    public void clearCircleAreaObject(){
        objectCircleArea = null;
    }

    @Test
    public void calculateCircleAreaPositiveTest()
    {

        objectCircle.setCircleRadius(2.2);
        objectCircleArea.calculateCircleArea(objectCircle);

        double expected=15.20;
        double actual= objectCircle.getCircleArea();
        assertEquals("calculateCircleAreaTest fails. Expected is " + expected + " Actual is :" + actual, expected, actual,0.01 );

    }
    @Test
    public void calculateCircleAreaNegativeTest()
    {

        objectCircle.setCircleRadius(-2.2);
        objectCircleArea.calculateCircleArea(objectCircle);

        double expected=0;
        double actual= objectCircle.getCircleArea();
        assertEquals("calculateCircleAreaTest fails. Expected is " + expected + " Actual is :" + actual, expected, actual,0.01 );

    }

}
